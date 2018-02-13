package com.example.W1;

/**
 * Created by Jiang Jinjing on 2017/9/13.
 */

public class Circle {
    double radius; //data

    //constructor
    Circle(){
        radius = 1;
    }

    Circle(double newRadius){
        radius = newRadius;
    }

    //method
    double getRadius(){
        return radius;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius *radius *3.14;
    }
}
