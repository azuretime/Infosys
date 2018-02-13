package com.example;

/**
 * Created by jit_biswas on 10/8/2017.
 */
public class Calculator {
    public static int add(int number1, int number2) {
        return number1+number2;
    }

    public static int sub(int number1, int number2) {
        return number1-number2;
    }

    public static int mul(int number1, int number2) {
        return number1*number2;
    }

    // Integer divide. Return a truncated int.
    public static int divInt(int number1, int number2) {

        if (number2 == 0) throw new IllegalArgumentException();
        int result = number1 / number2;

        return result;
    }
}

