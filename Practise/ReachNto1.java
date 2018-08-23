
public class ReachNto1 {

	public ReachNto1() {
		// TODO Auto-generated constructor stub
	}

	private static void findPathTo1(int n) {
		int count = 0;
		while (n != 1) {
			System.out.print(n + " ");
			count++;
			if (n % 2 == 0) {
				n = n / 2;

			} else {
				n = n - 1;
			}

		}
		System.out.print(n);
		System.out.println(" Count :" + count);
	}

	public static void main(String[] args) {
		findPathTo1(7);
	}
}
