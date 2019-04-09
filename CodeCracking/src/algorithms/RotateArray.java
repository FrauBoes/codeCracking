package algorithms;

public class RotateArray {
	public static void main(String[] args) {
		int[] nums = {1,2};
		
		// Define step size
		int k = 1;
		
		rotateArray(nums, k);
		
		// Print rotated array
		for (int i : nums)
			System.out.print(i + " ");
	}
	
	// Rotate elements of array by k steps to the right
	// k is non-negative
	public static void rotateArray(int[] nums, int k) {
		if (nums.length < 2 || k == 0) return;
		
		int len = nums.length;
		
		// Create new array to copy elements into
		int[] newNums = new int[len];
		
		// Insert elements shifted
		for (int i = 0; i < len; i++)
			newNums[(i + k) % len] = nums[i];
		
		// Copy elements back into original array
		for (int i = 0; i < len; i++)
			nums[i] = newNums[i];
	}
}
