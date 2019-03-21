package stringManipulation;

import java.util.LinkedList;
import java.util.List;

public class PermutationWithList {

	public static void main(String[] args) {
		
		LinkedList<String> list = (LinkedList<String>) permute("ABC");
		for (String s : list)
			System.out.println(s);
	}
	
	
	public static List<String> permute(String full) {
		// Check if input string is valid
		if (full.length() == 0 || full == null)
			System.out.println("You must provide a string of lenghth > 0.");
		
		// Call private method if input string is valid.
		LinkedList<String> list = new LinkedList<String>();
		
		permute("", full, list);
		
		return list;

	}
	
	private static List<String> permute (String prefix, String remaining, List<String> list) {

		if (remaining.length() == 0) {
			list.add(prefix);
		}
		
		for (int i = 0; i < remaining.length(); i ++) {
			permute(prefix + remaining.charAt(i), remaining.substring(0,i) 
					+ remaining.substring(i+1, remaining.length()), list);
		}
		
		return list;
		
	}
}
