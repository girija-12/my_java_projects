package java_lab;
import java.util.Scanner;
public class ArrayInputExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[] array=new int[10];
		System.out.println("Enter 10 values for the integer array:");
		for(int i=0;i<10;i++)
		{
			System.out.println("Value " + (i + 1) + ": ");
            array[i] = sc.nextInt();
		}
		System.out.println("The values in the array are ");
		for(int i=0;i<10;i++)
		{
			System.out.println("index "+i+" :"+array[i]);
		}
		sc.close();
	}

}
