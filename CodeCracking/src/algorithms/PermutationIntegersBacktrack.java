package algorithms;

import java.util.ArrayList;
import java.util.List;

public class PermutationIntegersBacktrack {

	public static void main(String[] args) {
		
		// Make test array
		int[] nums = {1,2,3};
		
		List<List<Integer>> list = permute(nums);
		
		// Print permutations
		for (List<Integer> l : list) {
			System.out.println(l);
		}
	}
	
	
	public static List<List<Integer>> permute(int[] nums) {
		// Check if input array is valid
		if (nums.length == 0 || nums == null)
			System.out.println("You must provide a list of lenghth > 0.");
		
		// Call private method if input is valid
		List<List<Integer>> list = new ArrayList<>();		
		
		backtrack(list, new ArrayList<>(), nums, 0);
		
		return list;

	}
	
	private static void backtrack (List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {

		if (tempList.size() == nums.length) {
			list.add(new ArrayList<>(tempList));
			return;
		}

		for (int i = 0; i <= tempList.size(); i++) {
			
			tempList.add(i, nums[start]);
			backtrack(list, tempList, nums, start+1);
			tempList.remove(i);
		}
	}
}	

		

