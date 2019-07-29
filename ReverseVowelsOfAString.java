import java.util.*;

public class ReverseVowelsOfAString {

	public static void main(String[] args) {
		String input = "leetcOde";
		System.out.println(reverseVowels(input));
	}

	private static String reverseVowels(String input) {
		StringBuilder output = new StringBuilder();
		List<Character> list = new ArrayList<Character>();
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || 
					input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'A' ||
					input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O' || 
					input.charAt(i) == 'U' ) {
				list.add(input.charAt(i));
			}
		}
		
		int j=list.size()-1;
		for(int i=0;i<input.length(); i++) {
			if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || 
					input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'A' ||
					input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O' || 
					input.charAt(i) == 'U' ) {
				output.append(list.get(j--));
			} else {
				output.append(input.charAt(i));
			}
		}
		
		return output.toString();
	}
}
