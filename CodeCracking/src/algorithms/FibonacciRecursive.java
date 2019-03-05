package algorithms;

public class FibonacciRecursive {
	public static void main(String[] args) {
		System.out.println(fib(2));
	}
	
	// Return the nth Fibonacci number
	// 1st Fib num = 0, 2nd = 1
	public static int fib(int n) {
		
		if (n == 1) return 0;
		
		else if (n == 2) return 1;
		
		else {
			return fib(n-2) + fib(n-1);
		}
		
	}
}
