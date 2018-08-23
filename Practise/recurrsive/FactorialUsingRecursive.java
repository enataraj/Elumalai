package recurrsive;

public class FactorialUsingRecursive {

	public static int findFact(int n) {
		if (n > 0) {
			System.out.println("Inside ");
			return n * findFact(n - 1);
		}
		System.out.println("Outside ");
		return 1;
	}

	public static void main(String[] args) {
		System.out.println("Fact : " + findFact(5));
	}
}
