package recurrsive;

public class ArrayOfSum {

	public static int sum(int a[], int sum, int i) {
		if (i < a.length) {
			sum = sum + a[i];
			System.out.println(sum);
			return sum(a, sum, i + 1);
		} else {
			return sum;
		}

	}

	public static void main(String[] args) {
		System.out.println("Sum Of Numbers :");
		int a[] = { 1, 2, 3, 4, 5 };

		System.out.println("Sum :"+sum(a, 0, 0));
	}

}
