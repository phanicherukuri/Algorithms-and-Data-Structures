
public class HeightChecker {

	public static void main(String[] args) {
		int[] input = new int[] { 1, 1, 1, 3 };
		System.out.println(heightChecker(input));
	}

	private static int heightChecker(int[] input) {
		int output = 0;
		int[] inputCopy = new int[input.length];

		for (int i = 0; i < input.length; i++) {
			inputCopy[i] = input[i];
		}

		inputCopy = MergeSort.mergeSort(inputCopy, inputCopy.length);

		for(int i=0; i<inputCopy.length; i++) {
			if(input[i] != inputCopy[i]) {
				output++;
			}
		}
		
		return output;
	}
}
