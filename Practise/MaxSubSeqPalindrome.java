
public class MaxSubSeqPalindrome {

	public static String findMaxSubPoly(String str) {
		int count = 0;
		String subSeq = "";
		String temp = "";
		int start = 0;
		int end = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {
			count++;
			int left = i - 1;
			int right = i + 1;
			temp = "";
			if ((i + 1) <= end && (str.charAt(i) == str.charAt(i + 1))) {
				temp = str.charAt(i) + "" + str.charAt(i + 1);
				right = right + 1;
			} else {
				temp = str.charAt(i) + "";
			}
			while (left >= start && right <= end) {
				count++;
				if (str.charAt(left) == str.charAt(right)) {
					temp = str.charAt(left) + temp + str.charAt(right);
					left--;
					right++;
				} else {
					break;
				}
			}

			if (temp.length() > subSeq.length()) {
				subSeq = temp;
			}

			// System.out.println("Temp : " + temp);
			// System.out.println("subSeq : " + subSeq);
		}

		 System.out.println("Result : " + subSeq);
		 System.out.println("Count : "+count);
		 System.out.println("Lenght : "+str.length());

		return subSeq;
	}

	public static void main(String[] args) {
		// String str = "Elumzallaziza";
		String str = "Elumzallaziza";
		findMaxSubPoly(str);
	}
}
