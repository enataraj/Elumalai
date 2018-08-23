package tobesolved;

public class FindMaxOccuString {

	public static void maxSeq(String str) {
		int count = 0;
		int maxCount = 0;
		char maxCh = str.charAt(0);
		char c = str.charAt(0);
		
		for (int i = 1; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;
			} else {
				if (count > maxCount) {
					maxCh = str.charAt(i-1);
					maxCount = count;
				}
				c = str.charAt(i);
				count = 1;
			}
		}
		System.out.println("Count : " + maxCount + " Char " + maxCh);
	}

	public static void main(String[] args) {
		String inp = "aabbbbcccsssssccccccccdddd";
		maxSeq(inp);
		char[] str = inp.toCharArray();

		int maxCount = 1;
		String resultStr = "";
		for (int i = 0; i < str.length; i++) {
			String tmp = "";
			for (int j = i; j < str.length; j++) {
				if (str[i] == str[j]) {
					tmp = tmp + str[i];
					if (j == str.length - 1) {
						i = i + tmp.length() - 1;
						break;
					}
				} else {
					i = i + tmp.length() - 1;
					break;
				}

			}

			if (maxCount < tmp.length()) {
				maxCount = tmp.length();
				resultStr = tmp;
			}

		}

		System.out.println("Result String :" + resultStr);
		System.out.println("Size of Result Str :" + maxCount);
	}

}
