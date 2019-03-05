package algorithms;

/**
 * Check primality of integer with O(sqrt(n)) complexity
 *
 */
public class Prime {
	public static void main(String[] args) {
		System.out.print(primality(7));
	}
	
	public static Boolean primality(int n) {
		if (n <= 3) return n > 1;
	
		else if (n % 2 == 0 || n % 3 == 0) return false;
		
		for (int i = 5; i < (int) Math.sqrt(n) + 1; i += 6) {
			if (n % i == 0) return false;
		}
		
		return true;
	}
}
