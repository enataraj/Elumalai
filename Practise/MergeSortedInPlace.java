import tobesolved.MyUtil;

public class MergeSortedInPlace {

	public static void mergeTwoArray(int a[], int b[]) {
		int m = 4;
		int n = 3;
		int len = a.length;
		while (m > 0 && n > 0) {
			if (a[m - 1] > b[n - 1]) {
				a[len - 1] = a[m - 1];
				m--;
			} else {
				a[len - 1] = b[n - 1];
				n--;
			}
			len--;
			MyUtil.printArray(a);
			// MyUtil.printArray(b);
		}

		System.out.println("m : " + m);
		System.out.println("n : " + n);
		System.out.println("len :" + len);

		while (m != 0) {
			a[len - 1] = a[m - 1];
			len--;
			m--;
		}

		while (n != 0) {
			a[len - 1] = b[n - 1];
			len--;
			n--;
		}

		MyUtil.printArray(a);

	}

	public static void main(String[] args) {
		int a[] = new int[7];
		int b[] = { 2, 5, 8 };
		a[0] = 6;
		a[1] = 8;
		a[2] = 9;
		a[3] = 10;
		mergeTwoArray(a, b);

	}

}
