package LeetCode;

/*
 * 
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending 
 * multiple copies of the substring together. You may assume the given string consists of lowercase English 
 * letters only and its length will not exceed 10000. 
 * 
 */

public class RepeatedSubStringPattern {

	public boolean repeatedSubstringPattern(String s) {
		
		int l = s.length();
		for(int i=l/2;i>=1;i--) {
			if(l%i==0) {
				int m = l/i;
				String subS = s.substring(0,i);
				StringBuilder sb = new StringBuilder();
				for(int j=0;j<m;j++) {
					sb.append(subS);
				}
				if(sb.toString().equals(s)) return true;
			}
		}
		return false;
		
		
	}

	public static void main(String[] args) {

		RepeatedSubStringPattern pat = new RepeatedSubStringPattern();
		if (pat.repeatedSubstringPattern("aabbaabb")) {
			System.out.println("Possible");
		} else {
			System.out.println("Not Possible");
		}
	}

}
