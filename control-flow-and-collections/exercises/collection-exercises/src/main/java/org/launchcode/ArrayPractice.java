package org.launchcode;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};

        // Loop and print all numbers
        System.out.println("All numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // Add a newline after printing odd numbers

        // Loop and print odd numbers
        System.out.println("Odd numbers:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // Add a newline after printing odd numbers

    }
}
