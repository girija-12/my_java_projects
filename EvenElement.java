package java_lab;
import java.util.Scanner;

public class EvenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
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

        // Display the even values stored in the array
        System.out.println("The even values in the array are:");
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) { // Check if the element is even
                System.out.println("Value at index " + i + ": " + numbers[i]);
            }
        }

        // Close the scanner
        scanner.close();

	}

}
