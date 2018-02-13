package com.example;

public class Electronics implements Visitable {
    private double price;



    Electronics(double item) {
        price = item;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
