package tobesolved;

import java.util.ArrayList;
import java.util.List;

public class SubsetForGivenChar {

	public static void main(String[] args) {
		List<String> subset = new ArrayList<>();
		subset.add("");
		String str = "abcd";
		for (int i = 0; i < 3; i++) {
			String res = str.substring(0, i);
			for (int j = i; j < str.length(); j++) {
				subset.add(res + str.charAt(j));
			}
		}

		System.out.println("Result : " + subset);
		System.out.println("Total Possible subset :" + subset.size());
	}
}
