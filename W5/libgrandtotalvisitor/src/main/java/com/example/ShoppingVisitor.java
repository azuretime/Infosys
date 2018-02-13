package com.example;

public class ShoppingVisitor implements Visitor {

    private double total = 0;


    @Override
    public void visit(Milk m) {
        total += m.getPrice();
    }

    @Override
    public void visit(Fish f) {
        total += f.getPrice()*f.getWeight();
    }

    @Override
    public void visit(Jacket j) {
        total += 1.2*j.getPrice();
    }

    public double getTotal() {
        return total;
    }
}
