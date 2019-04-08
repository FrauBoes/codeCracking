package advanced;
	
/**
 * @author thelma
 *
 * Given a sequence of integers 0-9 where the edges of each pair are +, - or combine them as digits
 * Example: 1 + 2, 1-2, 12
 * Find the shortest paths that results in the given value
 * Example: value = 100
 */
public class PathCalculateValue {
	public static void main(String[] args) {
		// Make array with elements 0-9
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println(FindPath(a, 200));
	}
	
	@SuppressWarnings("unused")
	public static String FindPath(int[] a, int value) {
		
		// Set up helpers to store current calculation path as string
		StringBuilder string = new StringBuilder("0");
		
		// Store current calculation value
		int v = 0;
		
		// Current potential values
		int v1 = 0;
		int v2 = 0;
		int v3 = 0;
		
		// Current indices
		int curr = 0;
		int before;
		int after;
		
		// Current potential indices
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		
		// Sentinel to limit traversal steps
		int count = 0;

		// Limit traversal to 100 steps
		while (count < 10000) {
			if (v == value)
				return string.toString();
			
			// Update values
			int vTemp = v;

				// Update before and after index
				if (curr == 0)
					before = 9;
				else
					before = curr - 1;
				
				if (curr == 9)
					after = 0;
				else
					after = curr + 1;
				
				// Compare updates of before and after
				if (Math.abs(value - (vTemp * 10 + a[before])) >= Math.abs(value - (vTemp * 10 + a[after]))) {
					v1 = vTemp * 10 + a[after];
					c1 = after;
				} else {
					v1 = vTemp * 10 + a[before];
					c1 = before;
				}
				if (Math.abs(value - vTemp - a[before]) >= Math.abs(value - vTemp - a[after])) {
					v2 = vTemp - a[after];
					c2 = after;
				} else {
					v2 = vTemp - a[before];
					c2 = before; 
				}
				if (Math.abs(value - vTemp + a[before]) >= Math.abs(value - vTemp + a[after])) {
					v3 = vTemp + a[after];
					c3 = after;
				} else { 
					v3 = vTemp + a[before];
					c3 = before;
				}
				
				// Compare updates of +, - or digit
				if (Math.abs(value - v1) <= Math.abs(value - v2) && Math.abs(value - v1) <= Math.abs(value - v3)) {
					v = v1;
					curr = c1;
					string.append(" D " + String.valueOf(v));
					
				} else if (Math.abs(value - v2) <= Math.abs(value - v1) && Math.abs(value - v2) <= Math.abs(value - v3)) {
					v = v2;
					curr = c2;
					string.append(" - " + String.valueOf(v));
				} else if (Math.abs(value - v3) <= Math.abs(value - v1) && Math.abs(value - v3) <= Math.abs(value - v2)) {
					v = v3;
					curr = c3;
					string.append(" + " + String.valueOf(v));
				}
				
			count++;
		}
	
		return "No path found for given value.";
	}
}

























