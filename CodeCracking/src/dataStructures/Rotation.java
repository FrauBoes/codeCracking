package dataStructures;

public class Rotation {
	
	public static void main(String[] args) {
		// Test method
		System.out.print(IsRotation("waterbottle", "erbottlewat"));

	}
	
	// Check if s1 is rotation of s2 or vice versa. 
	// Concatenate s1 with itself to create rotation and compare to s2
	public static boolean IsRotation(String s1, String s2) {
		if (s1.length() == s2.length() && s1.length() > 0) {
			
			String s1s1 = s1 + s1;
		
			return s1s1.contains(s2);
		}
		
		return false;
	}
}
