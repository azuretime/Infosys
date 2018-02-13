package com.example.W1;

/**
 * Created by Jiang Jinjing on 2017/9/11.
 */

public class Fibonacci {
    public static String fibonacci() {

        int f0 = 0;
        int f1 = 1;
        String s=f0+","+f1;
        for (int k = 0; k < 18; k++) {
            int f2 = f0 + f1;

            f0 = f1;
            f1 = f2;

            s = s + "," + f2;

        }

        return s;
    }

    public static void main(String[] args) {
        String s = fibonacci();
        System.out.println(s);
    }
}
