package tobesolved;

import java.util.Arrays;

public class NextGrater {

	public static void main(String[] args) {
		int[] a = { 4, 5, 2, 10 };
		int[] b = new int[a.length];
		Arrays.fill(b, -1);
		int j = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] < a[i]) {
				b[j] = a[i];
				j++;
			}
		}
		
		MyUtil.printArray(b);
	}

}
