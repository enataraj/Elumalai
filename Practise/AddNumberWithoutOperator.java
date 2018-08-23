
public class AddNumberWithoutOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
			System.out.println("A :" + a);
			System.out.println("B :" + b);
		}

		System.out.println("Sum : " + a);
	}

}
