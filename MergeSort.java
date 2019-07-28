
public class MergeSort {
	public static void main(String[] args) {
		int[] input = new int[] { 1, -4, -1, 0, 3, 10, 13, 10 };

		int[] result = mergeSort(input, input.length);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] mergeSort(int[] input, int length) {
		if (length < 2)
			return input;

		int mid = length / 2;
		int[] l = new int[mid];
		int[] r = new int[length - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = input[i];
		}

		for (int i = mid; i < length; i++) {
			r[i - mid] = input[i];
		}

		mergeSort(l, mid);
		mergeSort(r, length - mid);

		return merge(input, l, r);

	}

	private static int[] merge(int[] input, int[] l, int[] r) {
		int lLength = l.length;
		int rLength = r.length;
		int i = 0, j = 0, k = 0;

		while (i < lLength && j < rLength) {
			if (l[i] <= r[j]) {
				input[k] = l[i];
				i++;
				k++;
			} else {
				input[k] = r[j];
				j++;
				k++;
			}
		}

		while (i < lLength) {
			input[k] = l[i];
			k++;
			i++;
		}

		while (j < rLength) {
			input[k] = r[j];
			k++;
			j++;
		}
		return input;
	}
}
