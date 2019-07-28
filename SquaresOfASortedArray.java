import java.util.Arrays;

public class SquaresOfASortedArray {

	public static void main(String[] args) {
		int[] input = new int[] {-4,-1,0,3,10};
		sortedSquares(input);
	}
	
	private static int[] sortedSquares(int[] input) {
		int[] output = new int[input.length];
		
		for(int i=0;i< input.length; i++) {
			output[i] = (int) Math.pow(input[i], 2);
		}
		Arrays.sort(output);
		
		return output;
	}
}
