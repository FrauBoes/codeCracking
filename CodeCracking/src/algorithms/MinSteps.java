package algorithms;

/**
 * 
 * Method to count minimal operation count to generate certain number of chars.
 * Initially, only one char 'A' is present.
 * The only available operations are:
 * - copyAll: copy all chars present on notepad
 * - paste: paste all chars copied last
 * 
 * Given a number n, find the minimal number of operations needed to 
 * get exactly n chars on the notepad.
 * 
 * Example: input 3, output 3: copyAll + paste + paste
 * 
 * n range [1, 1000]
 *
 */
public class MinSteps {
	public static void main(String[] args) {
		System.out.println(minSteps(5));
	}
	
	
	public static int minSteps(int n) {
		// Return 0 if number of chars already present
		if (n == 1)
			return 0;
		
		// Initialize counter
		int res = 0;
		
		// Loop through possible divisors
		for(int i = 2; i <= n; i++) {
			
			// If divisible, add operation count to result
			// and divide n
			while (n % i == 0) {
				System.out.println(i);
				res += i;
				n /= i;
			}
		}
		
		return res;
	}
}
