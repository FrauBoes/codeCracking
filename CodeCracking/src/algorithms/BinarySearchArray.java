package algorithms;

class BinarySearchArray {
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 6};
		int target = 0;
		
		System.out.print(searchInsert(nums, target));
	}
	
    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0)
            return 0;

        int mid;
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            
            mid = (start + end) / 2;
          
            if (target < nums[mid]) {
                end = mid - 1;
                
            } else if (target > nums[mid]) {
                start = mid + 1;
                
            } else 
            	return mid;
        }
        
        return start;
    }
}
