package com.example.W1;

import java.util.Arrays;

/**
 * Created by Jiang Jinjing on 2017/9/25.
 */

public class Pset1 {
    public static boolean isAllCharacterUnique(String sIn) {
        if (sIn.length() > 128) {
            return false;
        }
        boolean containsUnique = false;

        for(char c : sIn.toCharArray()){
            if(sIn.indexOf(c) == sIn.lastIndexOf(c)){
                containsUnique = true;
            } else {
                containsUnique = false;
                break;
            }
        }

        return containsUnique;
    }
    public static boolean isPermutation(String sIn1, String sIn2) {
        if (sIn1.length() != sIn2.length())
            return false;

        char[] a = sIn1.toCharArray();
        char[] b = sIn2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

}
