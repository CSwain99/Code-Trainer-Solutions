import java.util.*;

public class Solution {
	public boolean isSorted(int[] nums) {
		// initialize variable
		boolean isSorted = true;
		
		// For loop checking each value pair in the array
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums [i + 1])
			isSorted = false;
		}
		
		return isSorted;
	}
}
