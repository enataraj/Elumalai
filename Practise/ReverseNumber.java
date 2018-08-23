/*
 * Reverse the Given Number
 */
public class ReverseNumber {

	public static void reverseNumber(int number) {
		int result = 0;
		while (number > 0) {
			result = (result * 10) + number % 10;
			number = number / 10;
		}
		System.out.println("Result : " + result);
	}

	public static void main(String[] args) {
		reverseNumber(102);
	}
}
