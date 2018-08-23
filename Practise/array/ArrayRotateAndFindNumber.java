package array;

public class ArrayRotateAndFindNumber {

	public ArrayRotateAndFindNumber() {
		// TODO Auto-generated constructor stub
	}

	private static int[] rotateAndFind(int[] a, int k, int[] m) {
		int result[] = new int[m.length];
		int tmp[] = new int[a.length];
		if (k > a.length) {
			k = a.length % k;
		} else if (k == a.length) {
			for (int i = 0; i < m.length; i++) {
				result[i] = a[m[i]];
			}
		}

		for (int i = 0; i < a.length; i++) {
			int tmpIdx = (i + k) % a.length;
			tmp[tmpIdx] = a[i];
			System.out.println(tmpIdx);
		}

		for (int i = 0; i < m.length; i++) {
			result[i] = tmp[m[i]];
		}
		return result;
	}

	private static int[] findROtateAndIndex(int[] a, int k, int[] m) {
		int[] result = new int[m.length];
		k = k % a.length;

		for (int i = 0; i < m.length; i++) {
			int ix = m[i];
			if (ix - k >= 0) {
				result[i] = a[ix - k];
			} else {
				result[i] = a[ix - k + a.length];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int k = 3;
		int b[] = { 2, 3 };
		int[] result = new int[b.length];
		result = rotateAndFind(a, k, b);
		for (int i = 0; i < result.length; i++) {
			System.out.print(" " + result[i]);
		}
		result = findROtateAndIndex(a, k, b);
		for (int i = 0; i < result.length; i++) {
			System.out.print(" " + result[i]);
		}
	}
}
