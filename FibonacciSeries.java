package java_lab;

public class FibonacciSeries {

	    // Recursive function to find the nth Fibonacci number
	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n; // Base case: return n for 0 and 1
	        }
	        // Recursive case: fib(n) = fib(n-1) + fib(n-2)
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		 System.out.println("Fibonacci series up to " + n + " terms:");

	        for (int i = 0; i < n; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	    }
}


