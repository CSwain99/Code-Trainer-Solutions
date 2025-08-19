import java.util.*;

public class Solution {
	public int countBits(int n) {
			// Initialize variables
			boolean isNegative = false;
			int maxBit10 = 1;
			int bits = 0;
			
			// First, convert negative to a positive and store
			// reference to change for later
			if (n < 0) { 
				isNegative = true;
				n *= -1;
			}
			
			// Next, calculate how many bits there are.
			while (n > 0) {
				// For loop finds largest number in base 10 that it 
				// can remove from the input. Exits immediately if 2.
				for (int i = 1; (n - i) >= 0; i *= 2) {
					maxBit10 = i;
				}
					
				// Set input lower and restart loop, counting number of bits
				n -= maxBit10;
				bits++;
			}
			
			// Return answer
			return bits;
		}		
	}	
