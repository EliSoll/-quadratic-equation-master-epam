package com.epam.rd.autotasks;

public class QuadraticEquation {
    public String solve(double a, double b, double c) {

        if (a == 0) {
            throw new IllegalArgumentException();
        }
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            return String.format("%s %s", root1, root2);
        } else if (discriminant == 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);

            return Double.toString(root1);
        } else
            return "no roots";
    }
}