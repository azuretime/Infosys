package com.example;

public class TaxVisitor implements Visitor {
    private double total = 0;
    private double taxCar;
    private double taxE;
    private double taxCho;


    public TaxVisitor(String s){
        if (s=="TAXNORMAL"){taxCar=0.4;taxE=0.8;taxCho=0.2;}
        else if (s=="TAXHOLIDAY"){taxCar=0.3;taxE=0.5;taxCho=0.1;}
    }
    @Override
    public void visit(Car c) {
        total += taxCar*c.getPrice();
    }

    @Override
    public void visit(Electronics e) {
        total += taxE*e.getPrice();
    }

    @Override
    public void visit(Chocolate c) {
        total += taxCho*c.getPrice();
    }

    public double getTotal() {
        return total;
    }
}


