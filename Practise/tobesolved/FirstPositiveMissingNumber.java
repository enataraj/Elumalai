package tobesolved;

public class FirstPositiveMissingNumber {

	public static void findFirstPositiveMissingNumber(int[] nums) {
		int min = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				continue;
			} else if (nums[i] < min) {
				min = nums[i];
			} else if (nums[i] > max) {
				max = nums[i];
			}
		}
	}

}
