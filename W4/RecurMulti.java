package com.example;

import java.lang.Math;


public class RecurMulti {
    public static void main(String[] args) {
        System.out.println(multiply(9,7));
        System.out.println(multiply(0,7));
        System.out.println(multiply(4,0));

    }

    public static int multiply(int i, int j) {
        if (i == 0||j == 0) return 0;
        return i+multiply(i,j-1);
    }

}