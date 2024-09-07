package lab_exercise;
import java.util.Scanner;
public class DivisionByZeroException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
            // Read input from user
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            // Perform division
            int result = divide(numerator, denominator);

            // Display result
            System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Cannot divide by zero.");
            } catch (Exception e) {
            // Handle other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
            } finally {
            // This block always executes, whether an exception occurs or not
            sc.close();
            }
		}
	// Method to perform division
    private static int divide(int numerator, int denominator) {
        return numerator / denominator;}
}

