public class Solution {
	public int findRange(int[] nums) {
		// Initialize variables
		int maxVal = 0;
		int minVal = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				maxVal = nums[0];
				minVal = nums[0];
			}
			
			if (maxVal < nums[i])
				maxVal = nums[i];
				
			if (minVal > nums[i])
				minVal = nums[i];
		}
		
		return maxVal - minVal;
	}
}
