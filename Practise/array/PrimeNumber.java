package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrimeNumber {

	public PrimeNumber() {

	}

	private static void generatePrimeNumber(int n) {
		List<Integer> primeNumbers = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		System.out.println(primeNumbers);
	}

	private static boolean isCircularPrime(int n) {
		{
			// Count digits.
			int count = 0, temp = n;
			while (temp > 0) {
				count++;
				temp /= 10;
			}

			int num = n;
			while (isPrime(num)) {

				// Following three lines generate the next
				// circular permutation of a number. We
				// move last digit to first position.
				int rem = num % 10;
				int div = num / 10;
				num = (int) ((Math.pow(10, count - 1)) * rem) + div;

				// If all the permutations are checked and
				// we obtain original number exit from loop.
				System.out.print(" " + num);
				if (num == n) {
					System.out.println();
					return true;
				}
			}

			return false;
		}
	}

	private static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}
		// System.out.println(Math.sqrt(n));
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Set<Integer> circularPrime = new HashSet<Integer>();
		for (int i = 0; i < 100000; i++) {
			if (isCircularPrime(i)) {
				circularPrime.add(i);
			}
		}

		System.out.println(circularPrime);
	}

}
