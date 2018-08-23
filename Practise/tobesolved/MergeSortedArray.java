package tobesolved;
// Merge the two sorted array and put the result in new array should be sorted.

public class MergeSortedArray {

	public static void main(String[] args) {

		int[] a = { 30, 31, 45, 67, 90 };
		int[] b = { 21, 25, 34, 56, 89, 90 };

		int aIndex = 0;
		int bIndex = 0;
		
		int[] result = new int[a.length + b.length];
		int resultIndex = 0;
		while (aIndex < a.length && bIndex < b.length) {
			if (a[aIndex] < b[bIndex]) {
				result[resultIndex] = a[aIndex];
				aIndex++;
				resultIndex++;
			} else {
				result[resultIndex] = b[bIndex];
				bIndex++;
				resultIndex++;

			}
		}

		if (aIndex < a.length) {
			for (int i = aIndex; i < a.length; i++) {
				result[resultIndex] = a[i];
				resultIndex++;
			}
		}

		if (bIndex < b.length) {
			for (int i = bIndex; i < b.length; i++) {
				result[resultIndex] = b[i];
				resultIndex++;
			}
		}

		System.out.println("Result : ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(" " + result[i]);
		}
	}
}
