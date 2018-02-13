package com.example;

/**
 * Created by jit_biswas on 10/2/2017.
 */
public class TestMoveInStars {
    public static void main(String[] args) {
        System.out.println("In TestMoveInStars");

        String s = "Massachussetts";
        String s1 = "anna";
        System.out.println(moveInStars(s));
    }

    public static String moveInStars(String s) {
        // Enter code here
        if (s.length() <= 1) return s;
        else {
            char first = s.charAt(0);
            char second = s.charAt(1);
            if (first == second) return (first + "*" +moveInStars(s.substring(1, s.length())));
            else return (s.substring(0, 1) + moveInStars(s.substring(1, s.length())));
        }
    }
}
