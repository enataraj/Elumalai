package tobesolved;

public class FactUsingRecursive {

	/*
	 * public void findFact(int number, int result) {
	 * 
	 * if (number > 1) { result = result * number; number = number - 1;
	 * findFact(number, result); System.out.println(result); return;
	 * 
	 * }
	 */

	public int findFact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * findFact(n - 1));
		}

	}

	public static void main(String[] args) {
		FactUsingRecursive fact = new FactUsingRecursive();
		int result = fact.findFact(5);
		System.out.println("Result :" + result);
	}

}
