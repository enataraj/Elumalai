package recursion;

public class RecursiveMultiplication {

	public RecursiveMultiplication() {
		// TODO Auto-generated constructor stub
	}

	private static int recursiveMultiplication(int a, int b, int result) {
		if (a == 0 || b == 0) {
			return 0;
		}

		if (a == 1) {
			return b;
		}

		if (b == 1) {
			return result;
		}
		result = result + a;
		System.out.println("Re : "+result);
		 recursiveMultiplication(a, b - 1, result);
		 return result;
		

	}

	public static void main(String[] args) {
		int a = 10;
		int b = 3;

		int result = recursiveMultiplication(a, b,a);
		System.out.println(result);
	}

}
