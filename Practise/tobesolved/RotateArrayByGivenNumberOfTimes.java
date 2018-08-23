package tobesolved;

public class RotateArrayByGivenNumberOfTimes {

	private static void rotateBrutForce(int[] a, int timesToRotate) {
		if (timesToRotate == a.length) {
			System.out.println("No Need to Rotate, It's same as original array");
		}
		if (timesToRotate > a.length) {
			timesToRotate = timesToRotate - a.length;
		}
		for (int i = 0; i < timesToRotate; i++) {
			int lastNumber = a[a.length - 1];
			for (int j = a.length - 2; j >= 0; j--) {
				a[j + 1] = a[j];
			}
			a[0] = lastNumber;

			// MyUtil.printArray(a);
		}

		System.out.println("Brute Force : ");
		MyUtil.printArray(a);

	}

	private static void rotate(int[] a, int k) {
		int temp = k;
		int n = a.length;
		for (int i = 0; i < k; i++) {
			System.out.println("How Many times");
			a[temp + i] = a[i];
			a[i] = a[n - (temp + i)];
		}
		System.out.println(" Optimized Rotate : ");
		MyUtil.printArray(a);
	}

	private static void rotateWithExtraArray(int a[], int k) {
		int res[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int inpIdx = (k + i) % a.length;
			res[inpIdx] = a[i];
			System.out.println("----");
		}
		
		System.out.println(" rotateWithExtraArray ");
		MyUtil.printArray(res);
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int timesToRotate = 7;
		//rotateBrutForce(a, timesToRotate);
		// rotateBrutForce(a, timesToRotate);
		// rotate(a, timesToRotate);
		
		rotateWithExtraArray(a, timesToRotate);

	}

}
