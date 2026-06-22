package com.bridgelabz.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTest {

    @Test
    void test106() {

        assertEquals(
                "00000000000000000000000001101010",
                Binary.toBinary(106)
        );
    }

    @Test
    void test0() {

        assertEquals(
                "00000000000000000000000000000000",
                Binary.toBinary(0)
        );
    }

    @Test
    void test1() {

        assertEquals(
                "00000000000000000000000000000001",
                Binary.toBinary(1)
        );
    }

    @Test
    void test8() {

        assertEquals(
                "00000000000000000000000000001000",
                Binary.toBinary(8)
        );
    }

    @Test
    void test255() {

        assertEquals(
                "00000000000000000000000011111111",
                Binary.toBinary(255)
        );
    }

    @Test
    void test1024() {

        assertEquals(
                "00000000000000000000010000000000",
                Binary.toBinary(1024)
        );
    }
}