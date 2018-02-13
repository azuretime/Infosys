package com.example.W1;

import java.util.ArrayList;

/**
 * Created by Jiang Jinjing on 2017/9/12.
 */

public class HailStoneSequence {

    public static ArrayList<Integer> genHS(int n){
        ArrayList<Integer> w= new ArrayList<>();
        w.add(n);
        while (n>1) {
            if (n%2==0)
                n =n/2;
            else n=n*3 + 1;

            w.add(n);
        }
        return w;
    }

    public static void main(String[] args) {
        System.out.println(genHS(5));

    }

}
