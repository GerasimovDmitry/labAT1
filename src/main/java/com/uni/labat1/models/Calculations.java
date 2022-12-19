package com.uni.labat1.models;

import lombok.Data;

@Data
public class Calculations {
    public static int plus(SysNumber numbers) {
        return numbers.getNum1() + numbers.getNum2();
    }

    public static int minus(SysNumber numbers) {
        return numbers.getNum1() - numbers.getNum2();
    }

    public static int multiplication(SysNumber numbers) {
        return numbers.getNum1() * numbers.getNum2();
    }

    public static int division(SysNumber numbers) {
        return numbers.getNum1() / numbers.getNum2();
    }

    public static SysNumber convert(int num1, int num2, int system) {
        SysNumber numbers = new SysNumber();
        if (system == 2) {
            numbers.setNum1(SysNumber.toBinary(num1));
            numbers.setNum2(SysNumber.toBinary(num2));
        }
        if (system == 8) {
            numbers.setNum1(SysNumber.toOctalString(num1));
            numbers.setNum2(SysNumber.toOctalString(num2));
        }
        if (system == 16) {
            numbers.setNum1(SysNumber.toHexString(num1));
            numbers.setNum2(SysNumber.toHexString(num2));
        }
        if (system == 10) {
            numbers.setNum1(num1);
            numbers.setNum2(num2);
        }
        return numbers;
    }

    public static int calculate(SysNumber numbers, char op, int system) {
        int result = switch (op) {
            case '+' -> plus(convert(numbers.getNum1(), numbers.getNum2(), system));
            case '-' -> minus(convert(numbers.getNum1(), numbers.getNum2(), system));
            case '*' -> multiplication(convert(numbers.getNum1(), numbers.getNum2(), system));
            case '/' -> division(convert(numbers.getNum1(), numbers.getNum2(), system));
            default -> 0;
        };
        System.out.print("\n Result:\n");
        System.out.print(numbers.getNum1() + " " + op + " " + numbers.getNum2() + " = " + Integer.toString(result, system));
        return result;
    }
}
