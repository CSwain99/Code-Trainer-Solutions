import java.util.*;

public class Solution {
	public void reverseArray(int[] nums) {
		int[] revNums = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			revNums[i] = nums[nums.length - 1 - i];
		}
		
		for (int i = 0; i < nums.length; i++)
			nums[i] = revNums[i];
	}
}
