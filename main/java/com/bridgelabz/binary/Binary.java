package com.bridgelabz.binary;

public class Binary {

    public static String toBinary(int number) {

        if (number == 0) {
            return "00000000000000000000000000000000";
        }

        StringBuilder binary = new StringBuilder();

        int power = 1;

        while (power <= number) {
            power *= 2;
        }

        power /= 2;

        while (power > 0) {

            if (number >= power) {
                binary.append("1");
                number -= power;
            } else {
                binary.append("0");
            }

            power /= 2;
        }

        while (binary.length() < 32) {
            binary.insert(0, "0");
        }

        return binary.toString();
    }

    public static void main(String[] args) {

        int number = 106;

        String binary = toBinary(number);

        System.out.println("Decimal : " + number);
        System.out.println("Binary  : " + binary);
    }
}