package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DegreeOfAnArray {

	private static void findDegree(int a[]) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {

			int key = a[i];
			if (map.get(key) != null) {
				int value = map.get(key) + 1;
				map.put(key, value);
			} else {
				map.put(key, 1);
			}
		}
		System.out.println("Number and Count Map" + map);

		TreeMap<Integer, List<Integer>> mapValue = new TreeMap<>();
		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			int key = itr.next();
			int value = map.get(key);
			if (mapValue.get(value) != null) {
				List<Integer> values = mapValue.get(value);
				values.add(key);
				mapValue.put(value, values);
			} else {
				List<Integer> values = new ArrayList<>();
				values.add(key);
				mapValue.put(value, values);
			}

		}
		System.out.println("Count and Number Map : " + mapValue);

		List<Integer> maxDegreeNumbers = mapValue.get(mapValue.lastKey());
		System.out.println("maxDegreeNumbers " + maxDegreeNumbers);

		int minSubArray = 0;
		for (int j = 0; j < maxDegreeNumbers.size(); j++) {
			int start = -1;
			int end = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == maxDegreeNumbers.get(j)) {
					if (start != -1) {
						end = i;
					} else {
						start = i;
					}
				}
			}
			System.out.println("Start : " + start + "  end " + end);
			int diff = (end - start) + 1;
			if (minSubArray == 0) {
				minSubArray = diff;
			} else if (minSubArray > diff) {
				minSubArray = diff;

			}
			System.out.println("Diff : " + diff);
			System.out.println("Min SubArray : " + minSubArray);
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 4, 2, 4, 5, 6, 3, 3, 9, 9, 9 };
		findDegree(a);

	}

}
