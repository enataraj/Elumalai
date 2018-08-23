package tobesolved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneKeyPad {

	public static void printPossibleString(Map<Integer, String> keyPad, String input) {
		List<String> result = new ArrayList<String>();
		List<String> finalResult = new ArrayList<String>();

		String firstStr = keyPad.get(Integer.parseInt("" + input.charAt(0)));

		for (int i = 0; i < firstStr.length(); i++) {
			result.add("" + firstStr.charAt(i));
		}

		for (int i = 1; i < input.length(); i++) {
			int num = Integer.parseInt("" + input.charAt(i));
			if (i != 1) {

				result = finalResult;
				finalResult = new ArrayList<>();
			}
			String str = keyPad.get(num);
			for (int j = 0; j < result.size(); j++) {
				for (int k = 0; k < str.length(); k++) {
					finalResult.add(result.get(j) + str.charAt(k));
				}
			}

		}

		System.out.println(finalResult);

	}

	public static void main(String[] args) {
		HashMap<Integer, String> keyPad = new HashMap<>();
		keyPad.put(0, "");
		keyPad.put(1, "");
		keyPad.put(2, "ABC");
		keyPad.put(3, "DEF");
		keyPad.put(4, "GHI");
		keyPad.put(5, "JKL");
		keyPad.put(6, "MNO");
		keyPad.put(7, "PQRS");
		keyPad.put(8, "TUV");
		keyPad.put(9, "WXYZ");

		String input = "23";

		printPossibleString(keyPad, input);

	}

}
