
public class ReverseWordsInAString {

	public static void main(String[] args) {
		String s = "a good   example";
		System.out.println(reverseWords(s));
	}
	
	private static String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		s = s.trim();
		s = s.replaceAll("\\s+", " ");

		String[] strArray = s.split(" ");
		
		for(int i = strArray.length-1; i>=0; i--) {
			sb.append(strArray[i]);
			if(i!=0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

}
