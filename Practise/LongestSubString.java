import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubString {
	/*
	 * Given a string, find the length of the longest substring without
	 * repeating characters.
	 * 
	 * Examples:
	 * 
	 * Given "abcabcbb", the answer is "abc", which the length is 3.
	 * 
	 * Given "bbbbb", the answer is "b", with the length of 1.
	 * 
	 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the
	 * answer must be a substring, "pwke" is a subsequence and not a substring.
	 * 
	 */

	public LongestSubString() {

	}

	private String findLongestSubString(String inputString) {

		String result = "";
		char[] inp = inputString.toCharArray();
		int len = 0;
		int tmpLen = 0;
		Set<Character> resultSet = new LinkedHashSet<>();
		String tempString = "";
		for(int i=0;i<inp.length;i++){
			char ch = inp[i];
			if(tempString.contains(""+ch)){
				
			}else{
				len++;
			}
		}

		return result;
	}

	private String findLongestSubSequence(String inputString) {
		String result = "";
		Set<Character> resultSet = new LinkedHashSet<>();
		for (char c : inputString.toCharArray()) {
			resultSet.add(c);
		}
		result = resultSet.toString();
		return result;
	}

	public static void main(String[] args) {
		LongestSubString ls = new LongestSubString();
		String result = ls.findLongestSubSequence("pwwkew");
		System.out.println(result);
	}
}
