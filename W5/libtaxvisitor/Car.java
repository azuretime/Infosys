package com.example;

public class Car implements Visitable {
    private double price;

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    Car(double item) {
        price = item;
    }

    public double getPrice() {
        return price;
    }
}
