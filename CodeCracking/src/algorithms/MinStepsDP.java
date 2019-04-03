package algorithms;

/**
 * Dynamic Programming implementation
 * 
 * 
 * Method to count minimal operation count to generate certain number of chars.
 * Initially, only one char 'A' is present.
 * 
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
public class MinStepsDP {
	public static void main(String[] args) {
		System.out.println(minSteps(100));
	}
	
	public static int minSteps(int n) {
		// Create array to store count per value
		int[] countStore = new int[n + 1]; 
		
		// Loop through possible divisors i
		for(int i = 2; i <= n; i++) {
			
			// Save count per possible divisor i
			countStore[i] = i;
			
			// Loop through possible divisors j of divisor i
			// Update count if smaller divisor found
			// This way counts are updated step-by-step and handed over 
			// to the next larger divisor
			for (int j = i - 1; j > 1; j--) {
				if (i % j == 0) {
					countStore[i] = countStore[j] + i/j;
					break;
				}
			}
		}
		
		// Return stored count for argument value
		return countStore[n];
	}
}
