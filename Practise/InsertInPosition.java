
public class InsertInPosition {

	public static int searchInsert(int[] nums, int target) {

		if (target > nums[nums.length - 1]) {
			return nums.length;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {

		int[] a = { 4, 6 };
		int result = searchInsert(a, 5);
		System.out.println("Result : " + result);

	}

}
