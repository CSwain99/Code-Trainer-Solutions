import java.util.*;

public class Solution {
	public int fib(int n) {
		// Feel like it's kinda cheating that the Fib sequence is presented as 0, 1, *1*, 2
		// Initialize variables
		int[] firstTwo = {0, 1};
		int fib1 = 1;
		int fib2 = 1;
		
		// Take care of edge cases of first couple
		// Sequence starts at 0th number with 0, then
		// 1st number is 1.
		switch(n) {
			case 0:
				return firstTwo[0];
			case 1:
				return firstTwo[1];
			case 2:
				return firstTwo[1];
		}
		
		// Fibonacci sequence calculator for loop for 3rd number onwards
		for (int i = 3; i <= n; i++) {
			firstTwo[0] = fib2;
			fib2 += fib1;
			fib1 = firstTwo[0];
		}
		
		return fib2;
	}
}
