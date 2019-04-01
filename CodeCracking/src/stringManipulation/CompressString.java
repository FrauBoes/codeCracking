package stringManipulation;

public class CompressString {
	public static void main(String[] args) {
//		System.out.println(compress("XXYYDDS"));
	}
	
	public static String compress(String s) {
		StringBuilder compressed = new StringBuilder();
		
		// Only start compression if compressed string can shorten length
		// Otherwise, or if s is empty, return s
		if (s.length() <= 2)
			return s;
		
		else {
			int count = 1;
			char current = s.charAt(0);
			
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i) == current)
					count++;
				
				else {
					compressed.append(Integer.toString(count) + current);
					count = 1;
					current = s.charAt(i);
				}
			}
			
			compressed.append(Integer.toString(count) + current);
		}
		
		// If original string is shorter, return it
		// Otherwise return compressed string
		return s.length() < compressed.toString().length() ? s : compressed.toString();
	}
}
