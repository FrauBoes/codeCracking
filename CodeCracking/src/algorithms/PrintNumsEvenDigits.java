package algorithms;

import java.util.ArrayList;


// Print all integers between 800 and 1000 that have all even digits.
public class PrintNumsEvenDigits {
	public static void main(String[] args) {
		ArrayList<Integer> a = findNumsEvenDigits();
		for (int n : a)
			System.out.println(n);
	}
	
	public static ArrayList<Integer> findNumsEvenDigits() {
		ArrayList<Integer> a = new ArrayList<Integer> ();
		
		for (int i = 800; i < 900; i += 20) {
			a.add(i);
			
			for(int j = 2; j <= 8; j += 2) {
				a.add(i+j);
			}
		}
		
		return a;
	}
}
