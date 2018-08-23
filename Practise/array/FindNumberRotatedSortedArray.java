package array;

public class FindNumberRotatedSortedArray {

	public FindNumberRotatedSortedArray() {
		// TODO Auto-generated constructor stub
	}

	private static boolean binarySearch(int[] a, int start, int end, int x) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] == x) {
				return true;
			}

			if (a[mid] < x) {
				start = mid + 1;

			} else {
				end = mid - 1;
			}

		}

		return false;

	}

	private static int findPivot(int[] a, int start, int end) {
		if (a == null) {
			return -1;

		}

		if (a.length == 1 && a[0] < a[end - 1]) {
			return 0;
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] > a[mid + 1]) {
				return mid + 1;
			} else if (a[start] <= a[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return -1;
	}

	private static boolean findNumber(int a[], int start, int end, int x) {
		int pivot = findPivot(a, start, end);
		if (pivot >0 && x >=a[0] && x<= a[pivot-1]) {
			end = pivot-1;	
		} else {
			start = pivot;
		}
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] == x) {
				return true;
			} else if (a[mid] > x) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		int a[] = { 8, 9, 10, 11, 3, 4, 5, 6 };
		int b[] = { 3, 4, 5, 6, 8, 9, 10, 11 };
		if (binarySearch(b, 0, b.length - 1, 9)) {
			System.out.println("Exists....");
		} else {
			System.out.println("Not exists ...");
		}

		if (findNumber(a, 0, a.length - 1, 9)) {
			System.out.println("Exist ..........2");
		} else {
			System.out.println("Not Exist .......");
		}

	}

}
