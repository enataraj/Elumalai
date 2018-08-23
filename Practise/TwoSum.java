import java.util.HashMap;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) != null) {
				result[0] = map.get(nums[i]);
				result[1] = i ;
				break;
			} else {
				int tmp = target - nums[i];
				map.put(tmp, i );
			}

		}

		return result;

	}
	
	public static void main(String[] args) {
		int a[] = {3,5,6,2,9};
		int[] result = new TwoSum().twoSum(a, 14);
		
		System.out.println(result[0]+"  "+result[1]);
	}

}
