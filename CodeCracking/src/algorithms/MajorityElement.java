package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author thelma
 *
 * Array is not empty and is guaranteed to contain 1 majority element
 * This is the element that occurs > array.length / 2 times
 */
class MajorityElement {
	public static void main(String[] args) {
		int[] nums = {3,2,3};
		System.out.println(majorityElementIterative(nums));
		System.out.println(majorityElementSorted(nums));
		System.out.println(majorityElementMoore(nums));

	}

	// Iterative solution using hashtable
	public static int majorityElementIterative(int[] nums) {
		if (nums.length == 1) return nums[0];

		Map<Integer, Integer> elements = new HashMap<Integer, Integer>();

		int maj = 0;
		int res = 0;

		for (int n : nums) {
			elements.merge(n, 1, (oldVal, newVal) -> oldVal + newVal);

			if (elements.get(n) > maj) {
				res = n;
				maj = elements.get(n);
			}
		}

		return res; 
	}

	// Sort array, then return element at index > length/2
	public static int majorityElementSorted(int[] nums) {
		Arrays.sort(nums);

		return nums[nums.length / 2];
	}
	
	// Boyer-Moore Majority Voting Algorithm
	// Use count variable to check that occurrence of majority variable is > length/2
	// Only if count == 0, res can change
	public static int majorityElementMoore(int[] nums) {
		int count = 0;
		int res = 0;
		
		for (int n : nums) {
			if (count == 0)
				res = n;
			if (n != res)
				count--;
			else
				count++;
		}
		
		return res;
	}
}