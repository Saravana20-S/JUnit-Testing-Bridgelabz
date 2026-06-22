package com.bridgelabz.monthlypayment;

public class MonthlyPayment {

    public static double calculateMonthlyPayment(double principal,
                                                 int years,
                                                 double annualRate) {

        double r = annualRate / (12 * 100);

        int n = years * 12;

        double payment =
                (principal * r) /
                        (1 - Math.pow(1 + r, -n));

        return payment;
    }

    public static void main(String[] args) {

        double principal = 100000;
        int years = 10;
        double rate = 5;

        double payment =
                calculateMonthlyPayment(principal,
                        years,
                        rate);

        System.out.printf(
                "Monthly Payment = %.2f%n",
                payment
        );
    }
}