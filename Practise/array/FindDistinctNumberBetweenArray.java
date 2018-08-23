package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Problem - For given two integer arrays, find numbers in the first array which are NOT present in the second array.

//Expectations:        
//             1.    Give sample so that we are all clear so far as understanding goes.
//             2.    3 parts: main, IO method and algorithm implementation. Focus on the last part.

//A = { 21,32,23,34,55,0}
//B = {21,23,32,41}
//result = {34, 55,0}

public class FindDistinctNumberBetweenArray {

	public FindDistinctNumberBetweenArray() {
		// TODO Auto-generated constructor stub
	}

	private static Integer[] findDistinctNumbers(Integer[] a, Integer[] b) {
		List<Integer> result = new ArrayList<>();
		if (a == null || a.length == 0) {
			return new Integer[0];
		}

		if (b == null || b.length == 0) {
			return a;
		}

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < b.length; i++) {
			set.add(b[i]);
		}

		for (int i = 0; i < a.length; i++) {
			if (!set.contains(a[i])) {
				result.add(a[i]);
			}
		}
		return result.toArray(new Integer[0]);
	}

	public static void main(String[] args) {
		

	}

}
