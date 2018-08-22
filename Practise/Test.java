
public class Test {

	public static void main(String[] args) {
		int number = 50071;
		System.out.println("Given number == " + number);
		int poly = getPolindrome(number + "");
		System.out.println("Closer polindrome 1 == " + poly);
		int diff = number - poly;
		System.out.println("Difference between the poli & given number == " + diff);
		int newPoly = number + diff;
		System.out.println("New Polindrome should be with thin this value == " + newPoly);
		newPoly = getPolindrome(newPoly + "");
		System.out.println("New Polindrome == " + newPoly);
		int newDiff = number - newPoly;
		System.out.println(newDiff);

		if (Math.abs(diff) > Math.abs(newDiff))
			System.out.println("closer polindrome =" + newPoly);
		else
			System.out.println("closer polindrome =" + poly);

	}

	private static String getPolindrome(String n) {

		int number = Integer.parseInt(n);
		int poly = 0;
		char[] charArr = (number + "").toCharArray();
		int length = charArr.length / 2;
		int x = 0;
		if (charArr.length % 2 == 0)
			x = -1;
		// System.out.println("lenght = " + length);
		for (int i = length, j = 0; i < charArr.length; i++) {
			charArr[i] = charArr[length - j + x];
			j++;
		}
		return ""+(poly = Integer.parseInt(String.valueOf(charArr)));
	}

}
