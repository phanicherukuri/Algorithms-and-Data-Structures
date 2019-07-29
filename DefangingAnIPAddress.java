
public class DefangingAnIPAddress {

	public static void main(String[] args) {
		String input = "1.1.1.1";
		System.out.println(defangIPaddr(input));

	}
	
	private static String defangIPaddr(String input) {
		StringBuilder output = new StringBuilder();
		
		for(int i=0; i<input.length();i++) {
			if(input.charAt(i) == '.') {
				output.append("[.]");
			} else {
				output.append(input.charAt(i));
			}
		}
		
		return output.toString();
	}
}
