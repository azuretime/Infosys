package com.example;

public class TestEndX {
    public static void main (String[] args) {
        System.out.println("In TestEndX");

        //String s = "kkix";
        String s = "kickback";
        System.out.println (endX(s));
    }
    public static String endX(String s) {
        // enter code here
        if (s.length()<= 1) return s;
        else {
            char first = s.charAt(0);
            if (first == 'k') return (endX(s.substring(1, s.length()))+"k");
            else return (s.substring(0,1)+ endX(s.substring(1,s.length())));
        }

    }
}
