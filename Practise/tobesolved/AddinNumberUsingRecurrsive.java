package tobesolved;

public class AddinNumberUsingRecurrsive {

	public int addNumber(int[] a, int index) {
		if (index >= 0) {
			return a[index] + addNumber(a, index - 1);
		}
		return 0;

	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int result = new AddinNumberUsingRecurrsive().addNumber(a, a.length - 1);
		System.out.println("Result " + result);

		int result1 = (a.length * (a.length + 1)) / 2;

		System.out.println("Result Calculated : " + result1);
	}

}
