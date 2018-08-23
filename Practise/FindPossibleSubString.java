import java.util.ArrayList;
import java.util.List;

public class FindPossibleSubString {

	/*
	 * Input : acacbacbdacbde Output : ac , acb, acbd,acbde
	 * 
	 * abcdefghabcdefghk
	 * 
	 */
	/*
	 * Work approach abcdefgh, abcdefghk
	 * 
	 * 8+9
	 * 
	 * 0,0 , 1,2 , 3,7,8,17
	 * 
	 */
	public FindPossibleSubString() {
		// TODO Auto-generated constructor stub
	}

	private static void splitString(String str) throws Exception {
		List<String> listStr = new ArrayList<>();
		int i = 0;
		int j =0;
		while (j < str.length()) {
			System.out.println("befor  " + i+","+j);			
			String subString = str.substring(i, j);
			i = j+1;
			j= i+i-1;
			listStr.add(subString);
			System.out.println("after  " + i+","+j);
			Thread.sleep(1000);
		}
		System.out.println(listStr);
	}

	public static void main(String[] args) {
		try {
			splitString("Elumalai");
		} catch (Exception e) {

		}
	}
}
