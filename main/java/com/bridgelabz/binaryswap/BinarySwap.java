package com.bridgelabz.binaryswap;

public class BinarySwap {

    public static String toBinary(int number) {
        return String.format("%8s",
                        Integer.toBinaryString(number))
                .replace(' ', '0');
    }

    public static String swapNibbles(String binary) {

        String leftNibble = binary.substring(0, 4);
        String rightNibble = binary.substring(4, 8);

        return rightNibble + leftNibble;
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static boolean isPowerOfTwo(int number) {

        if (number <= 0) {
            return false;
        }

        return (number & (number - 1)) == 0;
    }

    public static int swapNibblesAndGetNumber(int number) {

        String binary = toBinary(number);

        String swappedBinary = swapNibbles(binary);

        return binaryToDecimal(swappedBinary);
    }

    public static void main(String[] args) {

        int number = 100;

        String binary = toBinary(number);

        System.out.println("Original Number : " + number);
        System.out.println("Binary          : " + binary);

        String swappedBinary = swapNibbles(binary);

        System.out.println("Swapped Binary  : " + swappedBinary);

        int swappedNumber = binaryToDecimal(swappedBinary);

        System.out.println("Decimal Value   : " + swappedNumber);

        if (isPowerOfTwo(swappedNumber)) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a Power of 2");
        }
    }
}