package java_lab;
import java.util.Scanner;

public class DoubleArray {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        // Declare the double array with the specified size
        double[] numbers = new double[10];

        // Get values from the user to populate the array
        System.out.println("Enter 10 Double values:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
        }

        // Display the values stored in the array
        System.out.println("The values in the array are:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Value at index " + i + ": " + numbers[i]);
        }
        sc.close();
	}
}
