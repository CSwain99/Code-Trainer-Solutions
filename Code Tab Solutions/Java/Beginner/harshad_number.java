public class Solution {
	public boolean isHarshad(int n) {
		int totalDigits = 0;
		int digitSum = 0;
		int digitCutter = 1;
		int nCopy = n;
		
		// Setting up variable used to chop off digits
		for (int i = 1; n / i > 0; i *= 10)
			totalDigits++;
		
		for (int i = 1; i <= totalDigits; i++)
			digitCutter *= 10;
			
		// Chop off digit and add it to sum variable
		while (digitCutter > 0) {
			digitSum += nCopy / digitCutter;
			nCopy %= digitCutter;
			digitCutter /= 10;
		}
			
		// If sum isn't evenly divisible, return false
		// Else return true
		if (n % digitSum != 0) return false;
		else return true;
	}
}
