package crackingthecodinginterview;

import java.util.Arrays;

/*
 * 	There are three types of edits that can be performed on strings: insert a character,
	remove a character, or replace a character. Given two strings, write a function to check if they are
	one edit (or zero edits) away.
	EXAMPLE
		pale, ple -> true
		pales, pale -> true
		pale, bale -> true
		pale, bae -> false 
 */

public class OneAway {

	public static void main(String[] args) {
		String s1 = "pale";
		String s2 = "pales";
		System.out.println(oneEditAway(s1, s2));
	}

	private static boolean oneEditAway(String s1, String s2) {
		if (s1.length() - s2.length() > 1 || s2.length() - s1.length() > 1)
			return false;

		if (s1.length() == s2.length())
			return oneEditReplace(s1, s2);
		
		if (s1.length() > s2.length())
			return oneEditInsert(s1, s2);
		else
			return oneEditInsert(s2, s1);

	}

	private static boolean oneEditReplace(String s1, String s2) {
		boolean foundDifference = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i) && !foundDifference) {
				foundDifference = true;
			} else if (s1.charAt(i) != s2.charAt(i) && foundDifference) {
				return false;
			}
		}

		return true;
	}

	private static boolean oneEditInsert(String s1, String s2) {
		int i = 0;
		int j = 0;
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) != s2.charAt(j)) {
				if (i != j) {
					return false;
				}
				i++;
			} else {
				i++;
				j++;
			}
		}

		return true;
	}

}
