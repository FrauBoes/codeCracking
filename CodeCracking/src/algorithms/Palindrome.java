package algorithms;

// String with lower and upper case chars and whitespace
public class Palindrome {
	
	public static void main(String[] args) {
		System.out.print(isPali("Never odd or even"));
	}
	
	public static Boolean isPali(String s) {
		
		s = removeWhitespace(s.toLowerCase());
		
		for(int i = 0; i < s.length()/2; i++)
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		return true;
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
