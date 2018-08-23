package tobesolved;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		for (int i = 0; i < 45; i++) {
			second = first + second;
			first = second - first;
			System.out.println(second);
		}
	}
}
