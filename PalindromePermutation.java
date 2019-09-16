package crackingthecodinginterview;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * Given a string, write a function to check if it is a permutation of
a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
permutation is a rearrangement of letters. The palindrome does not need to be limited to just
dictionary words.
EXAMPLE
Input: Tact Coa
Output: True
 */

public class PalindromePermutation {

	public static void main(String[] args) {
		String s = "MadamInEdenImAdam";
		System.out.println(isPermutationOfPalindrome(s));
	}

	private static boolean isPermutationOfPalindrome(String s) {
		char[] ch = s.toLowerCase().toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
		}

		// if length is even - no odd count
		// if length is odd - only one odd count character should be there

		if (ch.length % 2 == 1) {
			// odd
			boolean oddCount = false;
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				if (entry.getValue() % 2 == 1 && oddCount) {
					return false;
				} else if (entry.getValue() % 2 == 1 && !oddCount) {
					oddCount = true;
				}
			}
		} else {
			// even
			boolean oddCount = false;
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				if(entry.getValue()%2 ==1)
					return false;
			}
		}

		return true;
	}

}
