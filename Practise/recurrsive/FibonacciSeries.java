package recurrsive;

import java.util.HashMap;

public class FibonacciSeries {

	public static void fibonacii(int a, int b, int num, int i) {
		if (i < num) {
			System.out.println(a);
			a = a + b;
			fibonacii(b, a, num, i + 1);
		}
	}

	// Recursive

	public static int fibRecursive(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibRecursive(number - 1) + fibRecursive(number - 2);
	}

	// Recusrive with DP

	public static int fibRecursiveDP(int number, HashMap<Integer, Integer> cache) {

		if (number == 1 || number == 2) {
			return 1;
		}

		int fib;
		if (cache.get(number) != null) {
			fib = cache.get(number);
		} else {
			fib = fibRecursiveDP(number - 1,cache) + fibRecursiveDP(number - 2,cache);
			cache.put(number, fib);
		}
		System.out.println(fib+" Map : " + cache);
		return fib;
	}

	public static void main(String[] args) {
		int number = 10;
//		fibonacii(0, 1, number, 0);

		System.out.println("Fibonacci series upto " + number + " numbers : ");
		// printing Fibonacci series upto number
		/*for (int i = 1; i <= number; i++) {
			System.out.print(fibRecursive(i) + " ");
		}*/

		System.out.print(fibRecursive(10) + " ");
		//for (int i = 1; i <= number; i++) {
//		fibRecursiveDP(10, new HashMap<Integer, Integer>());
		//}
	}

}
