package com.example;

public class FastExp{
    public static void main (String[] args){
        System.out.println("Recursion.");
        long k = 1;
        System.out.println(k + "^ 1000 = " + fastexp(k,1000));

    }

    public static long fastexp (long n, int exp){
        if (exp == 0) return 1;
        if (exp == 1) return n;
        else {
            if (exp%2 == 0) return (fastexp(n*n, exp/2));
            else return (n * fastexp(n*n, (exp-1)/2));
        }
    }

}