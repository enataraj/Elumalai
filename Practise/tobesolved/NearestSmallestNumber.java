package tobesolved;

public class NearestSmallestNumber {

	private static String nearestNumber(String str) {
		char[] strChar = str.toCharArray();
		for (int i = strChar.length - 1; i > 0; i--) {
			if (strChar[i] < strChar[i - 1]) {
				char ch = strChar[i];
				strChar[i] = strChar[i - 1];
				strChar[i - 1] = ch;
				break;
			}
		}

		System.out.println(strChar.toString());
		String result = "";
		for (int i = 0; i < strChar.length; i++) {
			result = result + strChar[i];
		}

		if (str.equals(result)) {
			return "-1";
		}

		return result;
	}

	public static void main(String[] args) {
		String str = "21";

		String nearstNumber = nearestNumber(str);
		System.out.println("Nearest Number : " + nearstNumber);

	}

}
