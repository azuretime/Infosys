package com.example.W1;

import java.util.Scanner;

/**
 * Created by Jiang Jinjing on 2017/9/21.
 */

public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for the following variables: a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
        if (equation.isSolvable()) {
            System.out.println("x is " +
                    equation.getX() + " and y is " + equation.getY());
        }
        else {
            System.out.println("The equation has no solution");
        }

    }

}
