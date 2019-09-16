package crackingthecodinginterview;

import java.util.*;

/*
 *  Implement an algorithm to determine if a string has all unique characters. What if you
	cannot use additional data structures? 
 */

public class IsUnique {

	public static void main(String[] args) {
		String s = "Phaniii";
		System.out.println(isUnique(s));
	}

	private static boolean isUnique(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue() > 1) {
				return false;
			}
		}
		
		return true;
	}
}
