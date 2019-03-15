package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


// Find all anagrams in a list of strings
// Return list of strings that have at least one anagram in the input list
public class FindAnagrams {
	public static void main(String[] args) {
		String[] arr = {"car", "arc", "night", "right", "rab", "bac", "cab"};
		Object[] result = getAnagrams(arr).toArray();
		
		for (Object s : result) 
			System.out.println(s);
	}
	
	public static HashSet<String> getAnagrams(String[] arr) {
		HashSet<String> res = new HashSet<String>();
		HashMap<String, String> map = new HashMap<String, String>();
		
		for (String s : arr) {
			
			// Get string containing chars of s sorted
			char tempArray[] = s.toCharArray();
			Arrays.sort(tempArray);
			String sSorted = new String(tempArray);

			if (res.contains(sSorted))
				continue;

			if (map.containsKey(sSorted)) {
				res.add(map.put(sSorted, s));
				res.add(s);
				
			} else {
				map.put(sSorted, s);
			}
		}
		
		return res;
	}
}
