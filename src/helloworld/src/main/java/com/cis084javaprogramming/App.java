package com.cis084javaprogramming;

/**
 * Name: Brendan Bobryk
 * Student ID #: 1036738
 * Class: CIS 084 Java Programming
 * Date: 09/19/23
 * Program: Primitive Data Types
 */

public class App {
    public static void main(String[] args) {
        int intValue = 1010101010;
        short shortValue = 10101;
        long longValue = 1010101010101010101L;
        byte byteValue = 101;
        boolean booleanValue = true;
        char charValue = 'A';
        float floatValue = 0.0101F;
        double doubleValue = 0.0101010101;

        Integer intObject = Integer.valueOf(1234);
        Float floatObject = Float.valueOf(0.0101F);

        System.out.println("Integer: " + intValue + "\nShort: " + shortValue + "\nLong: "
                + longValue + "\nByte: " + byteValue + "\nBoolean: " + booleanValue +
                "\nChar: " + charValue + "\nFloat: " + floatValue + "\nDouble: "
                + doubleValue + "\nInteger Variable: " + intObject + "\nFloat Variable: "
                + floatObject);
    }
}