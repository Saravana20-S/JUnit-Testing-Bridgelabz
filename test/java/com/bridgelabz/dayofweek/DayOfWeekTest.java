package com.bridgelabz.dayofweek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayOfWeekTest {

    @Test
    void testSunday() {
        assertEquals(0,
                DayOfWeek.dayOfWeek(6, 21, 2026));
    }

    @Test
    void testMonday() {
        assertEquals(1,
                DayOfWeek.dayOfWeek(6, 22, 2026));
    }

    @Test
    void testTuesday() {
        assertEquals(2,
                DayOfWeek.dayOfWeek(6, 23, 2026));
    }

    @Test
    void testNewYear2025() {
        assertEquals(3,
                DayOfWeek.dayOfWeek(1, 1, 2025));
    }

    @Test
    void testLeapYearDate() {
        assertEquals(4,
                DayOfWeek.dayOfWeek(2, 29, 2024));
    }

    @Test
    void testWednesday(){
        assertEquals(2,DayOfWeek.dayOfWeek(6,24,2026));
    }
}