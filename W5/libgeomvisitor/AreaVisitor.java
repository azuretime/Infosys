package com.example;

public class AreaVisitor implements Visitor {
    private double totalArea = 0;

    @Override
    public void visit(Circle c) {
        totalArea += Math.PI*Math.pow(c.getR(),2);
    }

    @Override
    public void visit(Square s) {
        totalArea += Math.pow(s.getX(),2);
    }

    @Override
    public void visit(Rectangle r) {
        totalArea += r.getL()*r.getW();
    }

    public double getTotalArea() {
        return totalArea;
    }
}

