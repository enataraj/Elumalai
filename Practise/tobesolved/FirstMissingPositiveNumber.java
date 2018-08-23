package tobesolved;

import java.util.Map;
import java.util.TreeMap;

public class FirstMissingPositiveNumber {

	public static void findFirstMissingPositive(int a[]) {

		Map<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], 0);
		}
		System.out.println(map);
		boolean flag = true;
		int firstNumber = map.keySet().iterator().next();
		while (flag) {
			if (firstNumber > 0) {
				if (map.get(firstNumber) == null) {
					System.out.println("First Missing Number : " + firstNumber);
					flag = false;
				} else {
					firstNumber++;
				}
			} else {
				firstNumber++;
			}
		}

	}

	public static void main(String[] args) {
		// int a[] = { -1, 2, 3, 2, };
		// int a[] = { -1, 0, 2 };
		int a[] = { 1, 2, 0 };
		findFirstMissingPositive(a);
	}

}
