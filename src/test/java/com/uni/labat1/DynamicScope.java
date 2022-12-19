package com.uni.labat1;

import com.uni.labat1.models.Calculations;
import com.uni.labat1.models.SysNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicScope extends Calculations {
    private DynamicTest buildTest(final int num1, final int num2, final char operator, final int expected, int system) {
        String displayName = String.format("%s %s %s = %s, Number system = %s", num1, operator, num2, expected, system);
        SysNumber numbers = new SysNumber();
        numbers.setNum1(num1);
        numbers.setNum2(num2);

        return dynamicTest(displayName, () -> {
            int res = Calculations.calculate(numbers, operator, system);
            assertEquals(expected, resultFormat(res, system));
        });
    }

    public static int resultFormat(int res, int system) {
        return Integer.parseInt(Integer.toString(res, system));
    }

    private void buildTestsFromFile(Collection<DynamicTest> tests, String fileName) {
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String line;
            in.readLine();

            String[] cells;
            int num1;
            int num2;
            int expectedSum;
            int expectedMinus;
            int system;

            while ((line = in.readLine()) != null) {
                cells = line.split(",");
                num1 = Integer.parseInt(cells[0]);
                num2 = Integer.parseInt(cells[1]);

                expectedSum = Integer.parseInt(cells[2]);
                expectedMinus = Integer.parseInt(cells[3]);
                system = Integer.parseInt(cells[4]);

                tests.add(buildTest(num1, num2, '+', expectedSum, system));
                tests.add(buildTest(num1, num2, '-', expectedMinus, system));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @DisplayName("Dynamic scope test")
    @TestFactory
    Collection<DynamicTest> runDynamicTest() {
        Collection<DynamicTest> tests = new ArrayList<>();

        Path currRelativePath = Paths.get("");
        String currFolder = currRelativePath.toAbsolutePath().toString();
        File folder = new File(currFolder);
        String[] folderContent = folder.list();

        assert folderContent != null;
        for (String file : folderContent) {
            if (file.endsWith(".csv")) {
                System.out.println(file);
                buildTestsFromFile(tests, file);
            }
        }

        return tests;
    }
}