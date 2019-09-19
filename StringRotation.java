package crackingthecodinginterview;

/*
 *  Assume you have a method i 5Su b 5 tr ing which checks if one word is a substring
of another. Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one
call to i5Sub5tring (e.g., "waterbottle" is a rotation of"erbottlewat"). 
 */

public class StringRotation {

	public static void main(String[] args) {
		String s1 = "aniph";
		String s2 = "phani";
		System.out.println(isRotation(s1, s2));
	}

	private static boolean isRotation(String s1, String s2) {
		if(s1.length()!=s2.length() || s1.length() == 0)
			return false;
		
		return isSubString(s1, s2);
	}
	
	private static boolean isSubString(String s1, String s2) {
		StringBuffer sb = new StringBuffer(s1);
		for(int i=0; i<s1.length(); i++) {
			if(sb.toString().equalsIgnoreCase(s2)) {
				return true;
			}
			else {
				char ch = sb.charAt(0);
				sb.deleteCharAt(0);
				sb.append(ch);
			}
		}
		return false;
	}
}
