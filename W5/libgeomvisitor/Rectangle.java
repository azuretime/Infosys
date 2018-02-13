package com.example;

public class Rectangle implements Visitable {
    private double w,l;

    Rectangle(double w, double l){
        this.w = w;
        this.l = l;
    }

    public double getL() {
        return l;
    }

    public double getW() {
        return w;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

