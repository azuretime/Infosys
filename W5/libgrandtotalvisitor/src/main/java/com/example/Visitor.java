package com.example;

public interface Visitor {
    void visit(Milk m);
    void visit(Fish f);
    void visit(Jacket j);
}