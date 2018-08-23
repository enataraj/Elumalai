package iBridge;

public class NearestPalindrom {

	public void nearestPalindromic(String n) {

		System.out.println("Given number == " + n);
		String poly = getPolindrome(n);
		System.out.println("Closer polindrome 1 == " + poly);
		int diff = Integer.parseInt(n) - Integer.parseInt(poly);
		System.out.println("Difference between the poli & given number == " + diff);
		int newPoly = Integer.parseInt(n) + diff;
		System.out.println("New Polindrome should be with thin this value == " + newPoly);
		newPoly = Integer.parseInt(getPolindrome(newPoly + ""));
		System.out.println("New Polindrome == " + newPoly);
		int newDiff = Integer.parseInt(n) - newPoly;
		System.out.println(newDiff);

		if (Math.abs(diff) > Math.abs(newDiff))
			System.out.println("closer polindrome =" + newPoly);
		else
			System.out.println("closer polindrome =" + poly);
	}

	private String getPolindrome(String n) {

		int length = n.length() / 2;
		int x = 0;
		if (n.length() % 2 == 0)
			x = -1;
		String str = "";
		for (int i = length, j = 0; i < n.length(); i++) {
			str = str + n.charAt(length - j + x);
			j++;
		}
		return str;

	}

	public static void main(String[] args) {
		new NearestPalindrom().nearestPalindromic("999");
	}
}
