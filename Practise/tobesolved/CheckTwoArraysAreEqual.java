package tobesolved;

import java.util.Arrays;
import java.util.HashSet;

/*
 * Approaches 1 . Sort and Compare each position
 * This will take care even if it has duplicate
 * 
 * Approach 2 : Add first array content into Hashset and Iterate the second array and check contains.
 * If it has duplicate element this algorithm will not work.
 * 
 * Brute Force method.
 * 
 * 
 */
public class CheckTwoArraysAreEqual {

	public static void arrayEqualApproch1(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				System.out.println("Arrays are not equal");
				return;
			}
		}

		System.out.println("Arrays are equal");

	}

	public static void arrayEqualApproach2(int[] a, int[] b) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}

		for (int j = 0; j < b.length; j++) {
			if (!set.contains(b[j])) {
				System.out.println("Arrays are not equal");
				return;
			}

		}

		System.out.println("Arrays are equal");
	}

	public static void main(String[] args) {
		int[] a = { 30, 31, 45, 67, 90 };
		int[] b = { 90, 31, 30, 67, 45,20 };

		arrayEqualApproch1(a, b);
		arrayEqualApproach2(a, b);
	}

}
