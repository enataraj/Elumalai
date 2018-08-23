package tobesolved;

public class ReverseArray {

	public void reverseArray(int a[], int left, int right) {
		if (left > right) {
			return;
		}
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
		left++;
		right--;
		MyUtil.printArray(a);
		reverseArray(a, left, right);

	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 12, 12, 43, 23 };

		int left = 0;
		int right = a.length - 1;
		// Recursive Method
		MyUtil.printArray(a);
		new ReverseArray().reverseArray(a, left, right);
		MyUtil.printArray(a);
		System.out.println("***************");
		// Linear way
		int temp;
		MyUtil.printArray(a);
		System.out.println();
		while (left < right) {
			temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}

		MyUtil.printArray(a);
	}
}
