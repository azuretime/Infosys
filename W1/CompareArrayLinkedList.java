package com.example.W1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jiang Jinjing on 2017/9/13.
 */

public class CompareArrayLinkedList {

    public static void main(String[] args){

        Integer[] a = new Integer[500000];

        ArrayList<Integer> w = new ArrayList<>(Arrays.asList(a));
        long startTime = System.nanoTime();
        for (int k=0; k < 10000; k++){
            //w.get(400000);
            w.add(2,1000);
        }
        long endTime = System.nanoTime();
        System.out.println("time taken in ms: " + (endTime - startTime)/1000000.0);
    }
}
