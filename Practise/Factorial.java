
public class Factorial {

	public Factorial() {
		// TODO Auto-generated constructor stub
	}

	private static int findFact(int n) {
		if (n == 0) {
			return 1;
		}
		return (n * findFact(n - 1));

	}

	public static void main(String[] args) {

		int fact = findFact(3);
		System.out.println("factorial : "+fact);
	}

}
