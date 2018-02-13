package com.example;

public class PerimeterVisitor implements Visitor {
    private double totalPerimeter = 0;

    @Override
    public void visit(Circle c) {
        totalPerimeter += 2*Math.PI
                *c.getR();
    }

    @Override
    public void visit(Square s) {
        totalPerimeter += 4*s.getX();
    }

    @Override
    public void visit(Rectangle r) {
        totalPerimeter += 2*(r.getW()+r.getL());
    }

    public double getTotalPerimeter() {
        return totalPerimeter;
    }
}

