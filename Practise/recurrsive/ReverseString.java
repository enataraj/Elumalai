package recurrsive;

public class ReverseString {

	public static void reverseStr(String str, int i) {
		if (i >= 0) {
			System.out.println(str.charAt(i));
			reverseStr(str, i - 1);
		}else{
			return;
		}		
	}

	public static void main(String[] args) {
		String str = "Reverse";
		reverseStr(str, str.length() - 1);
	}
}
