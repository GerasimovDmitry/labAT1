package com.uni.labat1.models;

import lombok.Data;

@Data
public class SysNumber {
    private int num1;
    private int num2;

    public static int toBinary(int num) {
        return Integer.parseInt(String.valueOf(num), 2);
    }

    public static int toOctalString(int num) {
        return Integer.parseInt(String.valueOf(num), 8);
    }

    public static int toHexString(int num) {
        return Integer.parseInt(String.valueOf(num), 16);
    }
}
