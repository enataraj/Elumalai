package tobesolved;

public class NextElementHigher {

	/*
	 * 1. https://www.interviewbit.com/problems/nextgreater/ Given an array,
	 * find the next greater element G[i] for every element A[i] in the array.
	 * The Next greater Element for an element A[i] is the first greater element
	 * on the right side of A[i] in array. More formally,
	 * 
	 * G[i] for an element A[i] = an element A[j] such that j is minimum
	 * possible AND j > i AND A[j] > A[i] Elements for which no greater element
	 * exist, consider next greater element as -1.
	 * 
	 * Example:
	 * 
	 * Input : A : [4, 5, 2, 10] Output : [5, 10, 10, -1]
	 * 
	 * Example 2:
	 * 
	 * Input : A : [3, 2, 1] Output : [-1, -1, -1]
	 */

	public static void main(String[] args) {
		int[] a = { 4, 5, 2, 10 };
		int i = 0;
		int j = 1;
		int k = 0;
		while (j < a.length) {
			k++;
			System.out.println("Time of loop :" + k);
			if (a[i] < a[j]) {
				a[i] = a[j];
				i = i + 1;
				j = i + 1;
			} else {
				j++;
			}
		}

		while ((i) < a.length) {
			a[i] = -1;
			i++;
		}
		MyUtil.printArray(a);
	}

}
