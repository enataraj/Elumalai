package array;

import java.util.Scanner;

public class FindMinAndMaxValue {

	/*
	 * Complete the miniMaxSum function below.
	 */
	static void miniMaxSum(int[] arr) {
		if (arr.length < 2) {
			return;
		}
		int minValue = arr[0];
		int maxValue = arr[0];
		long sum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			sum = sum + arr[i];
			if (minValue > arr[i]) {
				minValue = arr[i];
			} else if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}

		System.out.print((sum - maxValue) + " " + (sum - minValue));

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scan.nextLine().split(" ");

		for (int arrItr = 0; arrItr < 5; arrItr++) {
			int arrItem = Integer.parseInt(arrItems[arrItr].trim());
			arr[arrItr] = arrItem;
		}
		miniMaxSum(arr);
	}

}
