import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMinDistance {

	/*
	 * 1.Given a string, at each time, you can move any one of the char to the
	 * front,
	 * 
	 * ask you to find the minimum such move to get the target string
	 * 
	 * example
	 * 
	 * source abc, target cba :
	 * 
	 * abc -> bac -> cba
	 * 
	 * return 2
	 */

	public int findMinDistance(String src, String target) {
		int move = -1;
		ArrayList<Character> srcList =  new ArrayList<>();
		if (src == null || target == null) {
			return move;
		}

		if (src.length() != target.length()) {
			return move;

		}
		
		for(int i =0;i<src.length();i++){
			srcList.add(src.charAt(i);
		}

		char srcArray[] = src.toCharArray();
		
		List<Character> srcList = Arrays.asList(src.toCharArray());
		

		return move;
	}

}
