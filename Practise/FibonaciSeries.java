
public class FibonaciSeries {

	public static void main(String[] args) {
		int a = 9;
		System.out.println(" Using Looping :");
		fibonaciByLoopin(a);
		System.out.println("Using Recurision");
		System.out.println(" " + fibonaciByRecursion(a));
		System.out.println("Using DP ");
		fibonaciByDynamicPgm(a);
	}

	private static void fibonaciByDynamicPgm(int a) {
		int f[] = new int[a + 1];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i < a; i++) {
			f[i] = f[i - 1] + f[i - 2];
			System.out.println(f[i]);
		}
	}

	private static int fibonaciByRecursion(int a) {
		
			if (a == 0) {
				return a;

			}

			if (a == 1) {
				return a;
			}

			return (fibonaciByRecursion(a - 1) + fibonaciByRecursion(a - 2));
		
	}

	private static void fibonaciByLoopin(int a) {
		int i = 0;
		int j = 1;
		for (int k = 2; k < 9; k++) {
			int c = i + j;
			System.out.println(" " + j);
			i = j;
			j = c;
		}

	}

}
