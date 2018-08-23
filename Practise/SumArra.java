import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SumArra {
	public static void main(String[] args) {
		// code
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int cnt = 0;
		int sum = 0;
		Map<Integer, Integer> s = new HashMap<Integer, Integer>();
		for (int j = 0; j < n; j++) {
			int a = in.nextInt();
			sum = sum + a;
			System.out.println("Sum : " + sum);
			if (sum == 0)
				cnt++;
			if (s.containsKey(sum)) {
				System.out.println("Sum Contains ");
				int x = s.get(sum);
				cnt += x;
				s.put(sum, x + 1);
			} else {
				System.out.println("Key not exist");
				s.put(sum, 1);
			}
		}
		System.out.println("----------------");
		System.out.println(s);
		System.out.println("***************");
		System.out.println("Counnt :"+cnt);

	}
}