package com.bridgelabz.binaryswap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySwapTest {

    @Test
    void testToBinary() {

        assertEquals(
                "01100100",
                BinarySwap.toBinary(100)
        );
    }

    @Test
    void testSwapNibbles() {

        assertEquals(
                "01000110",
                BinarySwap.swapNibbles("01100100")
        );
    }

    @Test
    void testBinaryToDecimal() {

        assertEquals(
                70,
                BinarySwap.binaryToDecimal("01000110")
        );
    }

    @Test
    void testSwapNibblesAndGetNumber() {

        assertEquals(
                70,
                BinarySwap.swapNibblesAndGetNumber(100)
        );
    }

    @Test
    void testPowerOfTwoTrue() {

        assertTrue(
                BinarySwap.isPowerOfTwo(64)
        );
    }

    @Test
    void testPowerOfTwoFalse() {

        assertFalse(
                BinarySwap.isPowerOfTwo(70)
        );
    }
}