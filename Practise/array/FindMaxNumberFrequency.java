package array;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FindMaxNumberFrequency {
	/*
	 * Complete the birthdayCakeCandles function below.
	 */
	static int birthdayCakeCandles(int n, int[] ar) {
		if (n == 0 || n == 1) {
			return n;
		}

		int maxNumber = 0;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (maxNumber < ar[i]) {
				count = 1;
				maxNumber = ar[i];
			} else if (maxNumber == ar[i]) {
				count++;
			}
		}

		return count;

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] ar = new int[n];

		String[] arItems = scan.nextLine().split(" ");

		for (int arItr = 0; arItr < n; arItr++) {
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		int result = birthdayCakeCandles(n, ar);

		bw.write(String.valueOf(result));
		bw.newLine();

		bw.close();
	}
}
