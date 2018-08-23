package tobesolved;

public class OddEvenNumberInPlace {
	public static void main(String[] args) {
		int a[] = { 10,8,12,1,3,5};

		int oddIndex = 1;
		int evenIndex = 0;

		MyUtil.printArray(a);
		while (true) {
			while (oddIndex < a.length && a[oddIndex] % 2 == 1) {
				oddIndex = oddIndex + 2;
			}

			while (evenIndex < a.length && a[evenIndex] % 2 == 0) {
				evenIndex = evenIndex + 2;
			}

			System.out.println("Odd Index : " + oddIndex + " Even Index :" + evenIndex);

			if (oddIndex < a.length && evenIndex < a.length) {

				int temp = a[oddIndex];
				a[oddIndex] = a[evenIndex];
				a[evenIndex] = temp;
			} else {
				break;
			}
		}

		MyUtil.printArray(a);

	}

}
