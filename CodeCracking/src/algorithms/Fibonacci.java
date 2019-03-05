package algorithms;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fib(9));
	}
	
	// Return the nth Fibonacci number
	// 1st Fib num = 0, 2nd = 1
	public static int fib(int n) {
		int f1 = 0;
		int f2 = 1;
		int sum = 1;
			
		if (n == 1) return f1;
		else if (n == 2) return f2;
		
		else {
			for (int i = 3; i <= n; i++) {
				sum = f1 + f2;
				f1 = f2;
				f2 = sum;		
			}
			
			return sum;
		}
		
	}
}
