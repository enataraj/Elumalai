
public class FindMinNumber {

	public static void main(String[] args) {
		int a[] = { 4, 2, 56, 3, 6, 345, 7632, 435, 2 };
		int min = a[0];
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("Minumum Number : " + min);
		System.out.println("Max Number : " + max);
	}

}
