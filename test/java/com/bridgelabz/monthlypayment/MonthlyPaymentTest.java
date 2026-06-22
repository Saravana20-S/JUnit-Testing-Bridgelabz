package com.bridgelabz.monthlypayment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MonthlyPaymentTest {

    @Test
    void testLoan1() {

        double payment =
                MonthlyPayment.calculateMonthlyPayment(
                        100000,
                        10,
                        5
                );

        assertEquals(
                1060.66,
                payment,
                0.1
        );
    }

    @Test
    void testLoan2() {

        double payment =
                MonthlyPayment.calculateMonthlyPayment(
                        500000,
                        20,
                        7
                );

        assertEquals(
                3876.0,
                payment,
                1.0
        );
    }

    @Test
    void testLoan3() {

        double payment =
                MonthlyPayment.calculateMonthlyPayment(
                        200000,
                        15,
                        6
                );

        assertEquals(
                1687.7,
                payment,
                1.0
        );
    }

    @Test
    void testSmallLoan() {

        double payment =
                MonthlyPayment.calculateMonthlyPayment(
                        10000,
                        2,
                        8
                );

        assertTrue(payment > 0);
    }
}