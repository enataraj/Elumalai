package array;

public class SubArrayGivenSum {

	public SubArrayGivenSum() {
		// TODO Auto-generated constructor stub
	}

	private static void printSubArrayOfSum(int[] a, int sum) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			int tmpSum = a[i];
			if (tmpSum == sum) {
				count++;
			}

			for (int j = i + 1; j < a.length; j++) {
				tmpSum = tmpSum + a[j];
				if (tmpSum == sum) {
					count++;
				}
				if (tmpSum > sum) {
					break;
				}
			}

		}
		System.out.println("Count : " + count);
	}

	public static void main(String[] args) {
		int a[] = { 3, 2, 6, 1, 4, 5, 2, 5, 7, 8, 3 };
		printSubArrayOfSum(a, 25);
	}

}
