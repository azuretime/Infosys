package com.example;

public class Chocolate implements Visitable {

    private double price;

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    Chocolate(double item) {
        price = item;
    }

    public double getPrice() {
        return price;
    }

}
