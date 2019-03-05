package algorithms;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamic {
	public static void main(String[] args) {
		System.out.println(fib(8));
	}
	
	public static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	// Return the nth Fibonacci number
	// 1st Fib num = 0, 2nd = 1
	public static int fib(int n) {
		
		if (n == 1) return 0;
		
		else if (n == 2) return 1;
		
		else {
			if (map.containsKey(n))
				return map.get(n);
			else {
				int num = fib(n-2) + fib(n-1);
				map.put(n, num);
				return num;

			}	
		}
	}
}
