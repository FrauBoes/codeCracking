package algorithms;

public class FactorialRecursive {
	public static void main(String[] args) {
		System.out.print(fact(3));
	}
	
	public static Integer fact(int n) {
		
		if (n < 1) return 1;
		
		else {
			return n * fact(n-1);
		}
	}
}
