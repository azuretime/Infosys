package com.example.W1;

/**
 * Created by Jiang Jinjing on 2017/9/13.
 */

public class TstCircle {
    public static void main(String[] args){
        Circle c = new Circle();
        System.out.println(c.getRadius());

        Circle c2 = new Circle(10);
        System.out.println(c2.getRadius());
    }

}
