import java.util.Arrays;

public class TwoDirementionalStringArray {

	public TwoDirementionalStringArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[][] twoDArray = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				twoDArray[i][j] = "word " + i + " " + j;
			}
		}
		
		System.out.println(Arrays.deepToString(twoDArray));
	}

}
