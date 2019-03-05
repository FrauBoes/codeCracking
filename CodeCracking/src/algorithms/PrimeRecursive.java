package algorithms;

public class PrimeRecursive {
	
	static int divisor;
	
	public static void main(String[] args) {
		int n = 997;
		divisor = (int) Math.sqrt(n);

		System.out.print(primality(n));
	}
	
	
	public static Boolean primality(int n) {
		
		if (n <= 1) return false;
		else if (n % 2 == 0 || n % 3 == 0 || n % divisor == 0) return false;
		
		else {
			divisor -= 1;
			primality(n);
		}
		
		return true;
		
	}
}
