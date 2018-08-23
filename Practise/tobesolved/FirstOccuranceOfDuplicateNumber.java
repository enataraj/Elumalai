package tobesolved;

import java.util.HashMap;
import java.util.Map;

public class FirstOccuranceOfDuplicateNumber {

	public static int firstDuplicate(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.get(a[i]) != null) {
				return a[i];
			} else {
				map.put(a[i], a[i]);
			}
		}
		return -1;
	}

	public static int firstDuplicateApproach2(int[] a) {
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if (b[a[i]] != 0) {
				return a[i];
			} else {
				b[a[i]] = a[i];
			}
		}
		return -1;
	}

	public static int findRepeatingNumber(int[] nums) {
		/*
		 * algorithm Get the value at the index and then set that index
		 */

		for (int i = 0; i < nums.length; i++) {
			int index_from_val = Math.abs(nums[i]);
			System.out.println("index_from_val 1:" + index_from_val);
			index_from_val--;
			System.out.println("index_from_val 2:" + index_from_val);
			if (nums[index_from_val] > 0) {
				nums[index_from_val] = -nums[index_from_val];
				MyUtil.printArray(nums);
			} else {
				System.out.println("dddddddd : " + (index_from_val + 1));
				return index_from_val + 1;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 2, 3, 3, 1, 5, 2 };
		int duplicateNumber = firstDuplicate(a);
		System.out.println("First Duplicate Number :" + duplicateNumber);
		int duplicateNumberSec = firstDuplicateApproach2(a);
		System.out.println("First Duplicate Number :" + duplicateNumberSec);
		int dub = findRepeatingNumber(a);
		System.out.println("First Dup : " + dub);
	}

}
