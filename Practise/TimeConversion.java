import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		if (s == null || s.isEmpty()) {
			return "";
		}
		String[] strArr = s.split(":");
		int hh = 0;
		if (strArr[2].charAt(2) == 'P') {
			hh = Integer.parseInt(strArr[0]);
			hh = (hh + 12) % 24;
		} else {
			hh = Integer.parseInt(strArr[0]);
			if (hh == 12) {
				hh = 0;
			}
		}
		String tmp = hh + "";
		if (tmp.length() == 1) {
			tmp = "0" + tmp;
		}
		String min = strArr[1];
		String sec = strArr[2].substring(0, 2);
		String time = tmp + ":" + min + ":" + sec;
		return time;

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String result = timeConversion("04:59:59PM");
		System.out.println(result);

	}
}
