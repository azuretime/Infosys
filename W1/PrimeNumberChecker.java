package com.example.W1;

/**
 * Created by Jiang Jinjing on 2017/9/18.
 */

public class PrimeNumberChecker {

    public static int isPrime(int num){
        boolean prime = true;

        if(num<2) prime = false;
        else if (num==2) prime = true;
        else {
            for (int i = 2; i < num; i++) {
                if (num%i==0) prime = false;
            }
        }
        if (prime) return 1;
        else return 0;
    }

    public static void main (String[] args) {

        System.out.println( PrimeNumberChecker.isPrime(2));
        System.out.println( PrimeNumberChecker.isPrime(23));
        System.out.println( PrimeNumberChecker.isPrime(99));
    }
}
