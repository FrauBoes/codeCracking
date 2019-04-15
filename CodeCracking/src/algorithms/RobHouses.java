package algorithms;

/**
 * @author thelma
 *
 * A robber robs houses but cannot rob adjacent houses as they are connected with an alarm system
 * DP solution to array max sum
 * Return max sum of integers that are not adjacent
 */
class RobHouses {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 1};
		System.out.println(rob(nums));
	}
	
    public static int rob(int[] nums) {
        
        if (nums.length == 0)
            return 0;
        else if (nums.length == 1)
            return nums[0];
        else if (nums.length == 2)
            return (int) Math.max(nums[0], nums[1]);
        
        int prev1 = 0;
        int prev2 = 0;
        
        for (int n : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + n, prev1);
            prev2 = tmp;
        }
        
        return prev1;
    }
}
