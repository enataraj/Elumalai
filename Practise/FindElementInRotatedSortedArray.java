
public class FindElementInRotatedSortedArray {

	private void findPivot(int a[]) {
		int low = 0;
		int high = a.length - 1;

		if (a[low] < a[high]) {
			System.out.println("Array is not rotated ");

		}

		while (low <= high) {
			int mid = (low + high) / 2;
			System.out.println("mid--> "+mid);
			System.out.println("a[mid] "+a[mid]+" low :"+low+" high "+high);
			
			if ((a[mid] > a[mid + 1])) {
				System.out.println("Pivot : " + mid);
				break;
			} else if (a[mid] > a[low]) {
				low = mid + 1;
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 23, 43, 56, 67, 5, 6 };
		FindElementInRotatedSortedArray fn = new FindElementInRotatedSortedArray();
		fn.findPivot(a);

	}
}
