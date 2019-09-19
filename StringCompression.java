package crackingthecodinginterview;

/*
 *  Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z). 
 */

public class StringCompression {

	public static void main(String[] args) {
		String s1 = "aa";
		System.out.println(compress(s1));
	}

	private static String compress(String s1) {
		StringBuffer sb = new StringBuffer();
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			count++;
			if (i == s1.length() - 1) {
				sb.append(s1.charAt(i));
				sb.append(count);
			} else if (s1.charAt(i) != s1.charAt(i + 1)) {
				sb.append(s1.charAt(i));
				sb.append(count);
				count = 0;
			}
		}
		return sb.toString().length() >= s1.length() ? s1 : sb.toString();
	}
}
