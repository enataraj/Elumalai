import java.util.HashMap;

public class TwoSumPrintAllCompination {
	public static void findTwoSum(int[] nums, int sum) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < sum) {
				int temp = sum - nums[i];
				if (map.get(temp) != null) {
					System.out.println("Pairs are : " + temp + " " + nums[i]);
//					System.out.println("Pair Indexs :" + map.get(temp) + "   " + (i + 1));
					map.put(nums[i], i + 1);
				} else {
					map.put(nums[i], i + 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 6, 7, 2, 4, 76, 8, 2 };
		int sum = 9;
		findTwoSum(nums, sum);
	}
}
