import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDiffOfKInArray {

	public FindDiffOfKInArray() {
		// TODO Auto-generated constructor stub
	}

	private static void findDiffOfK(int[] a, int k) {
		List<String> pairList = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : a) {
			map.put(num, Integer.MIN_VALUE);
		}

		System.out.println(map);

		for (int num : a) {
			if (map.get(num + k) != null) {
				pairList.add("(" + num + "," + (num + k) + ")");
			}
		}

		System.out.println(pairList);
	}

	public static void main(String[] args) {
		int[] a = { 3, 2, 5, 6, 2, 6, 4, 6, 3, 6, 7 };
		int diff = 2;
		findDiffOfK(a, diff);

	}
}
