/*
 * public double findMaxAverage(int[] nums, int k) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
        sum[i] = sum[i - 1] + nums[i];
        double res = sum[k - 1] * 1.0 / k;
        for (int i = k; i < nums.length; i++) {
            res = Math.max(res, (sum[i] - sum[i - k]) * 1.0 / k);
        }
        return res;
    }
 * 
 * 
 */
package LeetCode;

public class AvgSumFindInArray {

	public double findMaxAverage(int[] nums, int k) {
		double maxAvg = 0.0;
		if (nums == null || nums.length == 0) {
			return maxAvg;
		}
		double total = 0.0;
		for (int i = 0; i < k; i++) {
			total = total + nums[i];
		}
		maxAvg = total / k;
		for (int i = 0; i < nums.length - k; i++) {
			total = total - nums[i] + nums[k + i];
			double tmpAvg = total / k;
			if (maxAvg < tmpAvg) {
				maxAvg = tmpAvg;
			}
		}

		return maxAvg;
	}

	public static void main(String[] args) {
		int a[] = { 1, 3, 12, -5, -6, 50 };
		int k = 3;
		double maxAvg = new AvgSumFindInArray().findMaxAverage(a, k);
		System.out.println("Max Avg : " + maxAvg);
	}
}
