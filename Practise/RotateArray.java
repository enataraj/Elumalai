
public class RotateArray {

	public RotateArray() {
		// TODO Auto-generated constructor stub
	}

	private static void rotateArray(int[] a, int k) {
		int len = a.length;
		int[] res = new int[len];
		if (k > len) {
			k = k % len;
		}

		for (int i = 0; i < len; i++) {
			int pos = (i + k) % len;
			res[pos] = a[i];
		}

		for (int i = 0; i < res.length; i++) {
			System.out.print("  " + res[i]);
		}
		for (int i = 0; i < len; i++) {
			int pos = (i + (len-k)) % len;
			res[pos] = a[i];
		}

		for (int i = 0; i < res.length; i++) {
			System.out.print("  " + res[i]);
		}
	}

	public static void main(String[] args) {
		int[] a = { 3, 4, 5, 6, 7, 8 };
		rotateArray(a,3);

	}

}
