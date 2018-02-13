package com.example;

 
public class Jacket implements Visitable {

    private double price;

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    Jacket(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


}

