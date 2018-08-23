package LeetCode;

/*
 * 
 * Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.

For example, with A = "abcd" and B = "cdabcdab".

Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").

Note:
The length of A and B will be between 1 and 10000. 

 */

/*
 * Solution
 * public int repeatedStringMatch(String A, String B) {
        int q = 1;
        StringBuilder S = new StringBuilder(A);
        for (; S.length() < B.length(); q++) S.append(A);
        if (S.indexOf(B) >= 0) return q;
        if (S.append(A).indexOf(B) >= 0) return q+1;
        return -1;
    }
 * 
 */
public class RepeatedStringMatch {

	public int repeatedStringMatch(String A, String B) {

		int result = -1;
		String srcString = A;

		if (A == null || B == null) {
			return -1;
		}
		int count = 1;
		while (B.length() > srcString.length()) {
			count++;
			srcString = srcString + A;
		}

		if (srcString.contains(B)) {
			return count;
		} else {
			srcString = srcString + A;
			count++;
			if (srcString.contains(B)) {
				return count;
			}
		}

		return result;

	}

	public static void main(String[] args) {
		String a = "abc";
		String b = "cabcd";

		int result = new RepeatedStringMatch().repeatedStringMatch(a, b);
		System.out.println("result :" + result);

	}

}
