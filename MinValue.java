package java_lab;
import java.util.Scanner;

public class MinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the integer array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the integer array with the specified size
        int[] numbers = new int[size];

        // Get values from the user to populate the array
        System.out.println("Enter " + size + " integer values:");

        for (int i = 0; i < size; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find the minimum value in the array
        int minValue = numbers[0]; // Assume the first element is the minimum initially

        for (int i = 1; i < size; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i]; // Update minValue if a smaller value is found
            }
        }

        // Display the minimum value
        System.out.println("The minimum value in the array is: " + minValue);

        // Close the scanner
        scanner.close();
	}

}
