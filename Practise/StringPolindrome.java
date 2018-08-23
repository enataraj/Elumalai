import java.util.Scanner;

public class StringPolindrome {
	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String str = sc.nextLine(); 

		//String str = "A man, a plan, a canal, Panama  !".toLowerCase();

		if (isPalindrome(str)) {
			System.out.println("String is Palindrome  :" + str);
		} else {
			System.err.println("String is not Palindrome  :" + str);
		}
	}

	private static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (Character.isDigit(str.charAt(i)) || Character.isAlphabetic(str.charAt(i))) {
				if (Character.isDigit(str.charAt(j)) || Character.isAlphabetic(str.charAt(j))) {
					if (!(str.charAt(i) == str.charAt(j))) {
						return false;
					} else {
						i++;
						j--;
					}
				} else {
					j--;
				}

			} else {
				i++;
			}
		}

		return true;

	}

}
