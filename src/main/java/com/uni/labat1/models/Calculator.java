package com.uni.labat1.models;

import java.util.Scanner;

public class Calculator extends Calculations {
    public static void testCalculation () {
        final int num1;
        final int num2;
        final char op;
        final int system;
        final Scanner reader = new Scanner(System.in);
        System.out.print("First number = ");
        num1 = reader.nextInt();
        System.out.print("Second number = ");
        num2 = reader.nextInt();
        final SysNumber numbers = new SysNumber();
        numbers.setNum1(num1);
        numbers.setNum2(num2);
        System.out.print("\n Number system from list [2, 8, 10, 16]: ");
        system = reader.nextInt();
        System.out.print("\n Operation from list(+, -, *, /): ");
        op = reader.next().charAt(0);
        calculate(numbers, op, system);
    }
}
