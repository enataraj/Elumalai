
public class FindElementInPlace {

	public static int searchInsert(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;
		int mid = 0;
		if (nums.length == 1) {
			if (target > nums[0])
				return 1;
			else
				return 0;
		}

		if (nums.length == 2) {
			if (target > nums[1]) {
				return 2;
			} else if (target < nums[0]) {
				return 0;
			} else if (nums[0] > target && nums[1] < target) {
				return 1;
			}
		}
		while (start <= end) {
			mid = (start + end) / 2;
			if (target > nums[mid]) {
				start = mid + 1;
			} else if (target < nums[mid]) {
				end = mid - 1;
			}

			if (target == nums[mid]) {
				return mid;
			}

		}
		return mid;

	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 5 };
		int result = searchInsert(a, 2);
		System.out.println("Result : " + result);
	}
}
