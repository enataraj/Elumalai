package tobesolved;

import java.util.HashMap;
import java.util.Map;

public class BooleanComparision {

	public static boolean compareBoolean(boolean a, boolean b) {
		/*
		 * if(a^b){ return true; }else{ return false; }
		 */

		return !(a ^ b);
	}

	public static Map<String, String> firstChar(String[] strings) {

		Map<String, String> map = new HashMap<>();
		for (String string : strings) {
			String firstChar = "" + string.charAt(0);
			if (map.get(firstChar) != null) {
				map.put(firstChar, map.get(firstChar) + string);
			} else {
				map.put(firstChar, string);
			}

		}

		return map;
	}

	public static int sumDigits(String str) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				result += Integer.parseInt("" + ch);
			}
		}
		return result;

	}

	public static void main(String[] args) {
		System.out.println(compareBoolean(true, true));
		System.out.println(compareBoolean(true, false));
		System.out.println(compareBoolean(false, true));
		System.out.println(compareBoolean(false, false));

		Map<String, String> map = new HashMap<>();
		if (map.get("a") != null) {
			map.put("b", map.get("a"));
		} else {
			map.put("a", map.get("b"));
		}

		String[] strings = { "aa", "bb", "cc", "aAA", "cCC", "d" };
		System.out.println(firstChar(strings));
		
		System.out.println(sumDigits("aa11b33"));
	}
}
