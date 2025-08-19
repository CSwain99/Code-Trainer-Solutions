import java.util.*;

public class Solution {
	public char mostCommonCharacter(String s) {
		// initialize variables
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int maxIndex = -1;
		int maxSize = 0;
		
		// Create map for tally count of each letter
		Map<Character, Integer> tallyMap = new HashMap<Character, Integer>();
		for (char a : alphabet.toCharArray()) {
			tallyMap.put(a, 0);
		}
		
		// Tally up occurrences of letters in the string
		for (int i = 0; i < s.length(); i++) {
			tallyMap.put(s.charAt(i), tallyMap.get(s.charAt(i)) + 1);
		}
		
		// Iterate through tallies and find the largest one
		for (int i = 0; i < tallyMap.size(); i++) {
			if (tallyMap.get(alphabet.charAt(i)) > maxSize) {
				maxSize = tallyMap.get(alphabet.charAt(i));
				maxIndex = i;
			}
		}
		
		return alphabet.charAt(maxIndex);
	}
}
