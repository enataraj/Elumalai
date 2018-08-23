
public class BinarySearchRecurrsion {

	private static int doBinarySearch(int a[], int number, int left, int right) {
		if (left <= right) {
			int mid = (left + right) / 2;
			if (a[mid] == number) {
				System.out.println("Number Present");
				return number;
			}
			if (a[mid] < number) {
				return doBinarySearch(a, number, mid + 1, right);
			} else {
				return doBinarySearch(a, number, left, mid - 1);
			}
		}		
		return -1;

	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 7, 8, 9, 10 };
		doBinarySearch(a, 4, 0, a.length - 1);
		doBinarySearch(a, 9, 0, a.length - 1);

		doBinarySearch(a, 2, 0, a.length - 1);
		doBinarySearch(a, 10, 0, a.length - 1);
		
		doBinarySearch(a, 20, 0, a.length - 1);
	}
}
