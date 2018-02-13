package com.example;
import java.lang.Math;


public class Circle implements Visitable {
    private double r;

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    Circle(double r){
        this.r = r;
    }

    public double getR() {
        return r;
    }
}
