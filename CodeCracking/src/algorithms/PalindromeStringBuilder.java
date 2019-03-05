package algorithms;

// String with lower and upper case chars and whitespace
// Using StringBuilder to reverse string
public class PalindromeStringBuilder {
	
	public static void main(String[] args) {
		System.out.print(isPali("Never odd or even"));
	}
	
	public static Boolean isPali(String s) {
		s = removeWhitespace(s.toLowerCase());

		return s.equals(new StringBuilder(s).reverse().toString());
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
