import java.util.*;

public class Solution {
	public int factorial(int n) {
		// init var
		int result = n;
		
		// For loop multiply
		for (int i = n - 1; i > 0; i--)
			result *= i;
			
		return result;
	}
}
