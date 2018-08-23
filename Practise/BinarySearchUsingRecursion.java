
public class BinarySearchUsingRecursion {

	private static boolean search(int a[], int start, int end, int searchNumber) {
		if (start < end) {
		int mid = start + (end - start) / 2;
		if (a[mid] < searchNumber) {
			start = mid + 1;
			return search(a, start, end, searchNumber);
			
		} else if (a[mid] > searchNumber) {
			end = mid;
			return search(a, start, end, searchNumber);
			 
		} else {
			return true;
		}
	}
	return false;
		
	}

	public static void main(String[] args) {
		int a[] = { 2,};// 4, 6, 23, 34, 45, 67, 78, 90 };
		int searchNumber = 2;
		boolean isExist = search(a, 0, a.length, searchNumber);
		System.out.println("Number Exist : " + isExist);
	}
}
