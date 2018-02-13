package com.example;

 
public class Milk implements Visitable {

    private double price;

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    Milk(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }



}
