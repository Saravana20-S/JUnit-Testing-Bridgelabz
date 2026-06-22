
package com.bridgelabz.vendingmachine;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineTest {

    @Test
    void testAmount2753() {

        List<Integer> notes = VendingMachine.getMinimumNotes(2753);

        assertEquals(8, notes.size());

        assertEquals(
                List.of(1000, 1000, 500, 100, 100, 50, 2, 1),
                notes
        );
    }

    @Test
    void testAmount0() {

        List<Integer> notes = VendingMachine.getMinimumNotes(0);

        assertTrue(notes.isEmpty());
        assertEquals(0, notes.size());
    }

    @Test
    void testAmount7() {

        List<Integer> notes = VendingMachine.getMinimumNotes(7);

        assertEquals(
                List.of(5, 2),
                notes
        );
    }

    @Test
    void testAmount11() {

        List<Integer> notes = VendingMachine.getMinimumNotes(11);

        assertEquals(
                List.of(10, 1),
                notes
        );
    }

    @Test
    void testAmount99() {

        List<Integer> notes = VendingMachine.getMinimumNotes(99);

        assertEquals(
                List.of(50, 10, 10, 10, 10, 5, 2, 2),
                notes
        );
    }

    @Test
    void testNoteCount() {

        int count = VendingMachine.getNoteCount(2753);

        assertEquals(8, count);
    }
}
