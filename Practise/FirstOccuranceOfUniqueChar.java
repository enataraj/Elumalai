import java.util.HashMap;
import java.util.Map;

public class FirstOccuranceOfUniqueChar {

	public static void getUniQueFirstOccurance(String str) {

		// Build Count Array
		char[] countArr = new char[256];
		for (int i = 0; i < str.length(); i++) {
			countArr[str.charAt(i)]++;
		}

		// Find first Occrance
		for (int i = 0; i < str.length(); i++) {
			if (countArr[str.charAt(i)] == 1) {
				System.out.println("Unique First Occurance " + str.charAt(i));
				break;
			}
		}

	}

	// my approach

	public static void getFirstOccurence(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.get(ch) != null) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) == 1) {
				System.out.println("First Occuranc : " + str.charAt(i));
				break;
			}
		}

	}

	public static void main(String[] args) {
		getUniQueFirstOccurance("Elumalai");
		getUniQueFirstOccurance("Nishanth");
		getUniQueFirstOccurance("aa");
		getFirstOccurence("Elumalai");
		getFirstOccurence("Nishanth");
		getFirstOccurence("aa");
	}
}
