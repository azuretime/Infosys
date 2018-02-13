package com.example;

public class Fish implements Visitable {
    private double price, weight;

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    Fish(double price, double weight){
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}

