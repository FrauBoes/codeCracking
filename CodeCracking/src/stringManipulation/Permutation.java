package stringManipulation;

public class Permutation {

	public static void main(String[] args) {
		permute("ABC");
	}
	
	
	public static void permute(String full) {
		// Check if input string is valid
		if (full.length() == 0 || full == null)
			System.out.println("You must provide a string of lenghth > 0.");
		// Call private method if input string is valid.
		else
			permute("", full);
	}
	
	private static void permute (String prefix, String remaining) {
		if (remaining.length() == 0) {
			System.out.println(prefix);
			return;
		}
		
		for (int i = 0; i < remaining.length(); i ++) {
			permute(prefix + remaining.charAt(i), remaining.substring(0,i) 
					+ remaining.substring(i+1, remaining.length()));
		}
		
	}
}
