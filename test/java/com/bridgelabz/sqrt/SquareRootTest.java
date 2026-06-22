package com.bridgelabz.sqrt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareRootTest {

    @Test
    void testPerfectSquare() {

        assertEquals(
                5.0,
                SquareRoot.sqrt(25),
                0.0001
        );
    }

    @Test
    void testAnotherPerfectSquare() {

        assertEquals(
                10.0,
                SquareRoot.sqrt(100),
                0.0001
        );
    }

    @Test
    void testNonPerfectSquare() {

        assertEquals(
                Math.sqrt(2),
                SquareRoot.sqrt(2),
                0.0001
        );
    }

    @Test
    void testOne() {

        assertEquals(
                1.0,
                SquareRoot.sqrt(1),
                0.0001
        );
    }

    @Test
    void testZero() {

        assertEquals(
                0.0,
                SquareRoot.sqrt(0),
                0.0001
        );
    }

    @Test
    void testNegativeNumber() {

        assertThrows(
                IllegalArgumentException.class,
                () -> SquareRoot.sqrt(-25)
        );
    }
}