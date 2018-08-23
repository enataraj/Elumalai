package search;

public class BinarySearch {

	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}

	private static int binarySearch(int a[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (a[mid] == x) {
				return x;
			}

			if (a[mid] > x) {
				return binarySearch(a, l, mid - 1, x);
			}

			if (a[mid] < x) {
				return binarySearch(a, mid + 1, r, x);
			}
		}
		return -1;
	}

	private static int binarySearch(int a[], int x) {
		int l = 0;
		int r = a.length - 1;

		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (a[mid] == x) {
				return x;
			}

			if (a[mid] < x) {
				l = mid + 1;
			}

			if (a[mid] > x) {
				r = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 6, 7, 12, 14, 15, 18, 23, 26, 29, 34, 36, 38 };
		int x = binarySearch(a, 0, a.length - 1, 19);
		System.out.println("Number available : " + x);
		
		x=binarySearch(a,2);
		System.out.println("Number available : "+x);
	}

}
