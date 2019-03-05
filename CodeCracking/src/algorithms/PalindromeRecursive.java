package algorithms;

// String with lower and upper case chars and whitespace
// Recursive implementation
public class PalindromeRecursive {
	
	public static void main(String[] args) {
		System.out.print(isPali("Motor"));
	}
	
	public static Boolean isPali(String s) {
		
		s = removeWhitespace(s.toLowerCase());
		
		// Base case for odd and even length of s
		if (s.length() == 0 || s.length() == 1)
			return true;
		
		else {
			if (s.charAt(0) != s.charAt(s.length() - 1))
				return false;
			else 
				return isPali(s.substring(1, s.length() - 1));
		}
	}
	
	public static String removeWhitespace(String s) {
		String s2 = "";
		
		for(int i = 0; i < s.length(); i++) {
			if (!Character.isSpaceChar(s.charAt(i)))
				s2 += s.charAt(i);	
		}
		return s2;
	}
}
