package algorithms;

public class FactorialRecursive {
	public static void main(String[] args) {
		System.out.print(fact(12));
	}
	
	public static Integer fact(int n) {
		
		if (n < 2) return 1;
		
		else {
			return n * fact(n-1);
		}
	}
}
