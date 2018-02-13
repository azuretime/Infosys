package com.example.W1;

// Question 1
// total: 10 points

//===============================================
// todo: complete the following program
//===============================================

import java.util.Scanner;

class LinearEquation {
    private double a, b, c, d, e, f, n1, n2, x, y;

    LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;

    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setE(double e) {
        this.e = e;
    }

    public void setF(double f) {
        this.f = f;
    }

    public boolean isSolvable() {
        if (a * d - b * c != 0) return true;
        else return false;
    }

    public double getX() {
        n1 = (e * d) - (b * f);
        x = n1 / (a * d - b * c);
        return x;
    }

    public double getY() {
        n2 = (a * f) - (e * c);
        y = n2 / (a * d - b * c);
        return y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for the following variables: a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

    }
}




//===============================================
// test case
//===============================================

/*

Input:

a = 1.0, b = 2.0, c = 3.0, d = 5.0, e = 6.0, f= 7.0

Expected Output: x is -16.0 and y is 11.0


Input: 

a = 1.25, b = 2.0, c = 2.0, d = 4.2, e = 3.0, f= 6.0

Expected Output: x is 0.48000000000000115 y is 1.2


Input: 

a = 1.0, b = 2.0, c = 2.0, d = 4.0, e = 3.0, f= 6.0

Expected Output: The equation has no solution

*/

