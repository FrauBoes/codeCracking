package algorithms;

// String with lower and upper case chars and whitespace
public class PalindromeIntegers {
	
	public static void main(String[] args) {
		System.out.print(isPali(121));
	}
	
	public static boolean isPali(int n) {
		
		int rev = 0;
		int num = n;
		
		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}
			
		return rev == num;
	}
}
