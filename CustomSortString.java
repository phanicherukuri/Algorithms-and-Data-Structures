package leetcode;

import java.util.*;

//LC - 791

public class CustomSortString {

	public static void main(String[] args) {
		String s = "cba";
		String t = "afjhlasfhabcyrteid";
		System.out.println(customSortString(s, t));
	}

	private static String customSortString(String s, String t) {
		Map<Character, Integer> tMap = new HashMap<>();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < t.length(); i++) {
			tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (tMap.get(s.charAt(i)) != null) {
				int val = tMap.get(s.charAt(i));
				while (val != 0) {
					result.append(s.charAt(i));
					val--;
				}
			}
			tMap.remove(s.charAt(i));
		}

		for (Map.Entry<Character, Integer> entry : tMap.entrySet()) {
			int val = entry.getValue();
			while (val != 0) {
				result.append(entry.getKey());
				val--;
			}
		}

		return result.toString();
	}
}
