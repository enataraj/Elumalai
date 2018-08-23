
public class MaxProductOfSubArray {

	private static void maxProductOfSubArray(int a[]) {
		if (a.length < 0) {
			return;
		}

		int min = a[0];
		int max = a[0];
		int maxAns = max;

		for (int i = 1; i < a.length; i++) {
			int mx = max;
			int mn = min;
			min = Math.min(Math.min(a[i], mx * a[i]), mn * a[i]);
			System.out.println("Min : " + min);
			max = Math.max(Math.max(a[i], mx * a[i]), mn * a[i]);
			System.out.println("Max : " + min);
			maxAns = Math.max(max,maxAns);
			System.out.println("Max Ans : " + maxAns);
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 3,-2,4 };
		maxProductOfSubArray(a);

	}

}
