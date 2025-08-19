import java.util.*;

public class Solution {
	public int findMax(int[] nums) {
		// Initialize variables
		int max = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) max = nums[0];
			
			if (max < nums[i]) max = nums[i];
		}
		
		return max;
	}
}
