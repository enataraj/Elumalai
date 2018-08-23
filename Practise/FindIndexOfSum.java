
public class FindIndexOfSum {

	/*
	 * In Given Integer Array {5,3,6,7,8,3} Find the find the sum of Two numbers
	 * Index position.
	 * 
	 * 
	 */

	public int[] twoSum(int[] nums, int target) {

		Integer[] indexArra = new Integer[target];
		int[] numberArray = { 3, 4, 5, 6, 12 };
		int[] result = new int[2];

		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] < target) {
				int temp = target - numberArray[i];
				if (indexArra[temp] != null) {
					result[0] = indexArra[temp];
					result[1] = i;
					System.out.println("Number exist : " + i + " " + indexArra[temp]);
					break;
				} else {
					indexArra[numberArray[i]] = i;
				}
			}
		}

		return result;

	}

	public static void main(String args[]) {
		int target = 9;

		int[] numberArray = { 3, 4, 5, 6, 12 };
		new FindIndexOfSum().twoSum(numberArray, target);
	}

}
