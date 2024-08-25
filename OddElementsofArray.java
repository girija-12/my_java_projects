package java_lab;

public class OddElementsofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {12, 45, 67, 34, 89, 23, 56, 78, 91, 10};

        // Display the odd values stored in the array
        System.out.println("The odd values in the array are:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) { // Check if the element is odd
                System.out.println("Value at index " + i + ": " + array[i]);
            }
        }

}
}
