package com.bridgelabz.sqrt;

public class SquareRoot {

    public static double sqrt(double c) {

        if (c < 0) {
            throw new IllegalArgumentException(
                    "Number must be non-negative");
        }

        double epsilon = 1e-15;

        double t = c;

        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }

        return t;
    }

    public static void main(String[] args) {

        double number = 25;

        double result = sqrt(number);

        System.out.println(
                "Square Root of " + number + " = " + result
        );
    }
}