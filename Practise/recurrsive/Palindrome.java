package recurrsive;

public class Palindrome {

	public static void isPalindrome(String str, int l, int r) {
		if (l <= r) {
			if (str.charAt(l) == str.charAt(r)) {
				l++;
				r--;
				System.out.println("Char  equal : " + str.charAt(l) + "  " + str.charAt(r));
				isPalindrome(str, l, r);
			} else {
				System.out.println(" Not Palindrome");
			}
		} else {
			System.out.println("Palindrome");
		}
	}

	public static void main(String[] args) {
		String str = "babcbab";
		isPalindrome(str, 0, str.length() - 1);
	}

}
