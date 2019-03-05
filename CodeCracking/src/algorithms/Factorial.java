package algorithms;

public class Factorial {
	public static void main(String[] args) {
		System.out.print(fact(5));
	}
	
	public static Integer fact(int n) {
		
		int sum = 1;
		
		for (int i = n; i > 1; i--) {
			sum *= i;
		}
		
		return sum;
	}
}
