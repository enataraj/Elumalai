package tobesolved;

public class FindNumberIsPowerOfTwo {

	// Approach one

	private static void findPowerOfTwo(int n) {
		while (n % 2 == 0) {
			n = n / 2;
		}

		if (n == 1) {
			System.out.println("Yes Power Of two ");
		} else {
			System.out.println("Nope it's not Power of Two");
		}
	}

	/**
	 * Simple bit wise operation . If any number Power of Two is Only one Bit
	 * set to 1.
	 * 
	 * Example : 8 -> 1000
	 * 
	 * any Previous number of Power of Two set all number as 1.
	 * 
	 * when we do bitwise AND operation result wll become zero.
	 */

	private static void findPowerOfTwoShort(int n) {
		if ((n & n - 1) == 0) {
			System.out.println("Yes Power of Two ..");
		} else {
			System.out.println("Nope it's not Power of Two");
		}
	}

	public static void main(String[] args) {

		findPowerOfTwo(10);
		findPowerOfTwoShort(8);
	}

}
