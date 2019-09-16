package crackingthecodinginterview;

/*
 * Given two strings, write a method to decide if one is a permutation of the
other
 */

public class CheckPermutation {

	public static void main(String[] args) {
		String s1 = "pat";
		String s2 = "tab";
		System.out.println(isPermutation(s1, s2));
	}

	private static boolean isPermutation(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		java.util.Arrays.sort(ch1);
		s1 = new String(ch1);
		java.util.Arrays.sort(ch2);
		s2 = new String(ch2);

		if(s1.equals(s2))
			return true;
		
		return false;
	}
}
