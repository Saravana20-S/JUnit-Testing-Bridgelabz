package com.bridgelabz.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private static final int[] NOTES = {1000, 500, 100, 50, 10, 5, 2, 1};

    public static List<Integer> getMinimumNotes(int amount) {
        List<Integer> notes = new ArrayList<>();
        calculateNotes(amount, 0, notes);
        return notes;
    }

    private static void calculateNotes(int amount, int index, List<Integer> notes) {

        if (amount == 0 || index >= NOTES.length) {
            return;
        }

        int note = NOTES[index];

        while (amount >= note) {
            notes.add(note);
            amount -= note;
        }

        calculateNotes(amount, index + 1, notes);
    }

    public static int getNoteCount(int amount) {
        return getMinimumNotes(amount).size();
    }

    public static void main(String[] args) {

        int amount = 2753;

        List<Integer> notes = getMinimumNotes(amount);

        System.out.println("Amount : " + amount);
        System.out.println("Minimum Notes Required : " + notes.size());

        System.out.println("Notes Returned : ");
        for (int note : notes) {
            System.out.print(note + " ");
        }
    }
}
