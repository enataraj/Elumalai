import tobesolved.MyUtil;

public class MaxSumOfSequenceSubArray {

	public static int findMaxSubSequenceArray(int[] a) {
		int max_sum_so_far = 0, max_sum_here = 0;
		int low = 0, high = 0, temp = 0;
		for (int i = 0; i < a.length; i++) {
			max_sum_here = max_sum_here + a[i];
			if (max_sum_so_far < max_sum_here) {
				max_sum_so_far = max_sum_here;
				low = temp;
				high = i;
			} else if (max_sum_here < 0) {
				max_sum_here = 0;
				temp = i + 1;

			}
		}

		System.out.println("Max sum of sub sequence Array : " + low + "  " + high);
		return max_sum_so_far;
	}

	public static void main(String[] args) {
		int a[] = {3,-2,23};
		MyUtil.printArray(a);
		System.out.println("Max Sum : " + findMaxSubSequenceArray(a));
	}
}
