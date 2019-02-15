package dataStructures;

public class UniqueChars {
	
	public static void main(String[] args) {
		// Test method
		System.out.print(IsUnique("hello"));

	}
	
	// Use bit vector to check for duplicates
	// Only works for up to 32 chars, e.g. only lower case chars of the alphabet
	public static boolean IsUnique(String s) {
		int checker = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			int val = s.charAt(i) - 'a';

			if ((checker & (1 << val)) > 0) {
				return false;
			}
			
			checker |= (1 << val);
		}
		
		return true;
	}
}
