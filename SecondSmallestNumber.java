package java_lab;

import java.util.Scanner;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the integer array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Check for valid array size
        if (size < 2) {
            System.out.println("Array size must be at least 2.");
            scanner.close();
            return;
        }

        // Declare the integer array with the specified size
        int[] numbers = new int[size];

        // Get values from the user to populate the array
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Initialize variables to find the smallest and second smallest values
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < smallest) {
                // Update second smallest before updating smallest
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        // Display the second smallest value
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest value (all elements might be the same).");
        } else {
            System.out.println("The second smallest value in the array is: " + secondSmallest);
        }

        // Close the scanner
        scanner.close();
    }
}

