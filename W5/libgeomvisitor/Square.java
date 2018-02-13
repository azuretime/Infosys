package com.example;


public class Square implements Visitable {
    private double x;

    Square(double x){
        this.x = x;
    }

    public double getX() {
        return x;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
