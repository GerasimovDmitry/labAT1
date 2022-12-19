package com.uni.labat1;

import com.uni.labat1.models.Calculations;
import com.uni.labat1.models.SysNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class ParamScope extends Calculations {
    SysNumber numbers = new SysNumber();

    @ParameterizedTest
    @DisplayName("Sum Binary")
    @CsvFileSource(resources = "/mocks/binary/binary.csv", numLinesToSkip = 1)
    void plusForBinary(int num1, int num2, int res, String operand) {
        if (operand.equals("+")) {
            numbers.setNum1(SysNumber.toBinary(num1));
            numbers.setNum2(SysNumber.toBinary(num2));
            int result = plus(numbers);
            int actualValue = Integer.parseInt(Integer.toString(result, 2));
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Division Binary")
    @CsvFileSource(resources = "/mocks/binary/binary.csv", numLinesToSkip = 1)
    void divisionForBinary(int num1, int num2, int res, String operand) {
        if (operand.equals("/")) {
            numbers.setNum1(SysNumber.toBinary(num1));
            numbers.setNum2(SysNumber.toBinary(num2));
            int result = division(numbers);
            int actualValue = Integer.parseInt(Integer.toString(result, 2));
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Minus Binary")
    @CsvFileSource(resources = "/mocks/binary/binary.csv", numLinesToSkip = 1)
    void minusForBinary(int num1, int num2, int res, String operand) {
        if (operand.equals("-")) {
            numbers.setNum1(SysNumber.toBinary(num1));
            numbers.setNum2(SysNumber.toBinary(num2));
            int result = minus(numbers);
            int actualValue = Integer.parseInt(Integer.toString(result, 2));
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Mult Binary")
    @CsvFileSource(resources = "/mocks/binary/binary.csv", numLinesToSkip = 1)
    void multiForBinary(int num1, int num2, int res, String operand) {
        if (operand.equals("*")) {
            numbers.setNum1(SysNumber.toBinary(num1));
            numbers.setNum2(SysNumber.toBinary(num2));
            int result = multiplication(numbers);
            int actualValue = Integer.parseInt(Integer.toString(result, 2));
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Sum Octal")
    @CsvFileSource(resources = "/mocks/octal/octal.csv", numLinesToSkip = 1)
    void plusForOctal(int num1, int num2, int res, String operand) {
        if (operand.equals("+")) {
            numbers.setNum1(SysNumber.toOctalString(num1));
            numbers.setNum2(SysNumber.toOctalString(num2));
            int result = plus(numbers);
            int actualValue = Integer.parseInt(Integer.toString(result, 8));
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Division Octal")
    @CsvFileSource(resources = "/mocks/octal/octal.csv", numLinesToSkip = 1)
    void divisionForOctal(int num1, int num2, int res, String operand) {
        if (operand.equals("/")) {
            numbers.setNum1(SysNumber.toOctalString(num1));
            numbers.setNum2(SysNumber.toOctalString(num2));
            int result = division(numbers);
            int actualValue = Integer.parseInt(Integer.toString(result, 8));
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Minus Octal")
    @CsvFileSource(resources = "/mocks/octal/octal.csv", numLinesToSkip = 1)
    void minusForOctal(int num1, int num2, int res, String operand) {
        if (operand.equals("-")) {
            numbers.setNum1(SysNumber.toOctalString(num1));
            numbers.setNum2(SysNumber.toOctalString(num2));
            int result = minus(numbers);
            int actualValue = Integer.parseInt(Integer.toString(result, 8));
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Mult Octal")
    @CsvFileSource(resources = "/mocks/octal/octal.csv", numLinesToSkip = 1)
    void multiForOctal(int num1, int num2, int res, String operand) {
        if (operand.equals("*")) {
            numbers.setNum1(SysNumber.toOctalString(num1));
            numbers.setNum2(SysNumber.toOctalString(num2));
            int result = multiplication(numbers);
            int actualValue = Integer.parseInt(Integer.toString(result, 8));
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Sum Hex")
    @CsvFileSource(resources = "/mocks/hex/hex.csv", numLinesToSkip = 1)
    void plusForHex(int num1, int num2, int res, String operand) {
        if (operand.equals("+")) {
            numbers.setNum1(SysNumber.toHexString(num1));
            numbers.setNum2(SysNumber.toHexString(num2));
            int result = plus(numbers);
            int actualValue = Integer.parseInt(Integer.toString(result, 16));
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Division Hex")
    @CsvFileSource(resources = "/mocks/hex/hex.csv", numLinesToSkip = 1)
    void divisionForHex(int num1, int num2, int res, String operand) {
        if (operand.equals("/")) {
            numbers.setNum1(SysNumber.toHexString(num1));
            numbers.setNum2(SysNumber.toHexString(num2));
            int result = division(numbers);
            int actualValue = Integer.parseInt(Integer.toString(result, 16));
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Minus Hex")
    @CsvFileSource(resources = "/mocks/hex/hex.csv", numLinesToSkip = 1)
    void minusForHex(int num1, int num2, int res, String operand) {
        if (operand.equals("-")) {
            numbers.setNum1(SysNumber.toHexString(num1));
            numbers.setNum2(SysNumber.toHexString(num2));
            int result = minus(numbers);
            int actualValue = Integer.parseInt(Integer.toString(result, 16));
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Mult Hex")
    @CsvFileSource(resources = "/mocks/hex/hex.csv", numLinesToSkip = 1)
    void multiForHex(int num1, int num2, int res, String operand) {
        if (operand.equals("*")) {
            numbers.setNum1(SysNumber.toHexString(num1));
            numbers.setNum2(SysNumber.toHexString(num2));
            int result = multiplication(numbers);
            int actualValue = Integer.parseInt(Integer.toString(result, 16));
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Sum Decimal")
    @CsvFileSource(resources = "/mocks/decimal/decimal.csv", numLinesToSkip = 1)
    void plusForDecimal(int num1, int num2, int res, String operand) {
        if (operand.equals("+")) {
            numbers.setNum1(num1);
            numbers.setNum2(num2);
            int actualValue = plus(numbers);
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Division Decimal")
    @CsvFileSource(resources = "/mocks/decimal/decimal.csv", numLinesToSkip = 1)
    void divisionForDecimal(int num1, int num2, int res, String operand) {
        if (operand.equals("/")) {
            numbers.setNum1(num1);
            numbers.setNum2(num2);
            int actualValue = division(numbers);
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Minus Decimal")
    @CsvFileSource(resources = "/mocks/decimal/decimal.csv", numLinesToSkip = 1)
    void minusForDecimal(int num1, int num2, int res, String operand) {
        if (operand.equals("-")) {
            numbers.setNum1(num1);
            numbers.setNum2(num2);
            int actualValue = minus(numbers);
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Mult Decimal")
    @CsvFileSource(resources = "/mocks/decimal/decimal.csv", numLinesToSkip = 1)
    void multiForDecimal(int num1, int num2, int res, String operand) {
        if (operand.equals("*")) {
            numbers.setNum1(num1);
            numbers.setNum2(num2);
            int actualValue = multiplication(numbers);
            assertEquals(res, actualValue);
        }
    }

    @ParameterizedTest
    @DisplayName("Division by zero")
    @CsvFileSource(resources = "/mocks/divisionByZero.csv", numLinesToSkip = 1)
    void divisionTest(int num1, int num2) {
        numbers.setNum1(num1);
        numbers.setNum2(num2);
        assertThrows(ArithmeticException.class, () -> division(numbers));
    }
}