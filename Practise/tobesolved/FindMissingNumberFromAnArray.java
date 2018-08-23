package tobesolved;

/*
 * You are given an integer array containing 1 to n but one of the number from 1 to n in the array is missing. You need to provide optimum solution to find the missing number. Number can not be repeated in the arry.
 * 
 * int[] arr1={7,5,6,1,4,2};
Missing numner : 3
int[] arr2={5,3,1,2};
Missing numner : 4


Algorithm

    Find the sum of n number using formula n=n*(n+1)/2
    Find the sum of elements present in given array.
    Substract (sum of n numbers – sum of elements present in the array).

 */

public class FindMissingNumberFromAnArray {

	// find the missing numbers inbetween 1 to 20.

	private static void findMissingNumbers(int a[]) {

		boolean missingNumberArray[] = new boolean[20];

		for (int i = 0; i < a.length; i++) {
			missingNumberArray[a[i] - 1] = true;
		}

		System.out.println("Missing Number : ");
		for (int i = 0; i < missingNumberArray.length; i++) {
			if (!missingNumberArray[i]) {
				System.out.println(" " + (i + 1));
			}
		}

	}

	public static void main(String[] args) {
		int[] a = { 5, 6, 20 };

		findMissingNumbers(a);
	}

}
