package java_lab;
import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		
				Scanner sc= new Scanner(System.in);

		        // Ask the user for the size of the integer array
		        System.out.print("Enter the size of the array: ");
		        int size = sc.nextInt();

		        // Declare the integer array with the specified size
		        int[] numbers = new int[size];
		        
		        System.out.println("Enter " + size + " integer values:");

		        for (int i = 0; i < size; i++) {
		            System.out.print("Value " + (i + 1) + ": ");
		            numbers[i] = sc.nextInt();
		        }

		        int maxValue = numbers[0];
		        for (int i = 1; i < size; i++) {
		            if (numbers[i] > maxValue) {
		                maxValue = numbers[i]; 
		            }
		        }

		        // Display the minimum value
		        System.out.println("The maximum value in the array is: " + maxValue);

		        // Close the scanner
		        sc.close();

	}

}
