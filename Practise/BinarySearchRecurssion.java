import tobesolved.MyUtil;

public class BinarySearchRecurssion {

	public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {

		if (start <= end) {
			int mid = start + (end - start) / 2;
			if (key < sortedArray[mid]) {
				return recursiveBinarySearch(sortedArray, start, mid - 1, key);

			} else if (key > sortedArray[mid]) {
				return recursiveBinarySearch(sortedArray, mid + 1, end, key);

			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int a[] = { 3, 4, 5, 76, 80, 99, 123, 145, 178 };
		// search.binarySearch(a, 0, a.length - 1, 2);
		MyUtil.printArray(a);
		int mid = recursiveBinarySearch(a, 0, a.length - 1, 146);
		System.out.println("Middle : " + mid);
	}
}
