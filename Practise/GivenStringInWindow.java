/*
 * In the given String find the second string which
 */
public class GivenStringInWindow {

	public static void main(String[] args) {
		String inputStr = "hghdgef";
		String validateStr = "hfe";

		int lenght = validateStr.length();
		boolean flag = false;
		do {
			flag = findSmallWindow(lenght, inputStr, validateStr);
			if (!flag) {
				lenght = lenght + 1;
			}
			if (lenght > inputStr.length()) {
				flag = true;
			}
		} while (!flag);

	}

	public static boolean findSmallWindow(int lenght, String inputStr, String validateStr) {
		for (int i = 0; i < inputStr.length(); i++) {
			boolean sucessflag = true;
			if ((lenght + i) <= inputStr.length()) {
				String substr = inputStr.substring(i, lenght + i);
				System.out.println(substr);
				for (int j = 0; j < validateStr.length(); j++) {
					if (!substr.contains("" + validateStr.charAt(j))) {
						sucessflag = false;
					}
				}

				if (sucessflag) {
					System.out.println("Small Window :" + substr);
					return true;
				}
			}
		}

		return false;
	}
}
