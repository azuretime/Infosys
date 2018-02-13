package com.example.W1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Jiang Jinjing on 2017/9/18.
 */

public class IteratingExamples_iterator {
    public static int Act2Iterator(List<Integer> integers) {

        int sum = 0;
        for (Iterator<Integer>  iter = integers.iterator(); iter.hasNext(); ) {
            sum += iter.next();

        }
        return sum;
    }

    public static void main(String[] args){

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(6);
        int sum=Act2Iterator(integers);

        System.out.println(sum);

    }
}
