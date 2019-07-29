import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		String input = "Test1ng-Leet=code-Q!";
		System.out.println(reverseOnlyLetters(input));
	}

	private static String reverseOnlyLetters(String input) {
		StringBuilder output = new StringBuilder();

		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < input.length(); i++) {
			if (((int) input.charAt(i) >= 65 && (int) input.charAt(i) <= 90)
					|| ((int) input.charAt(i) >= 97 && (int) input.charAt(i) <= 122)) {
				list.add(input.charAt(i));
			}
		}

		Collections.reverse(list);

		int j = 0;
		for (int i = 0; i < input.length(); i++) {
			if (((int) input.charAt(i) >= 65 && (int) input.charAt(i) <= 90)
					|| ((int) input.charAt(i) >= 97 && (int) input.charAt(i) <= 122)) {
				output.append(list.get(j++));
			} else {
				output.append(input.charAt(i));
			}
		}

		return output.toString();

	}
}
