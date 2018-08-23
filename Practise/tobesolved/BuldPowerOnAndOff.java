package tobesolved;

public class BuldPowerOnAndOff {

	public static void printArray(int a[]) {
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
	}

	// Linear approach

	public void linearApproach(int a[]) {

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
				for (int j = i; j < a.length; j++) {
					if (a[j] == 0) {
						a[j] = 1;
					} else {
						a[j] = 0;
					}
				}
				printArray(a);
			}
		}

		System.out.println();
		System.out.println("Number of Times " + count);

	}

	// tricky approach

	public void trickyApproach(int a[]) {

		int count1 = 0;
		for (int j = 0; j < a.length; j++) {
			if (a[j] == 0 && count1 % 2 == 0) {
				count1 += 1;
			} else if (a[j] == 1 && count1 % 2 == 1) {
				count1 += 1;
			}

		}
		System.out.println("Count :" + count1);

	}

	// state change count approach

	public void statechnageCount(int a[]) {

		int count2 = 0;
		if (a[0] == 0) {
			count2++;
		}
		for (int i = 1; i < a.length; i++) {
			if (a[i] != a[i - 1]) {
				count2++;
			}
		}
		System.out.println("Count :" + count2);
	}

	public static void main(String[] args) {

		int a[] = { 0, 1, 0, 0, 1, 0, 1 };
		new BuldPowerOnAndOff().trickyApproach(a);
		new BuldPowerOnAndOff().statechnageCount(a);
		new BuldPowerOnAndOff().linearApproach(a);

	}

}
