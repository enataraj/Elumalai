
public class Convert12To24HrFormat {

	public Convert12To24HrFormat() {
		// TODO Auto-generated constructor stub
	}

	static String timeConversion(String s) {
		if (s == null || s.isEmpty()) {
			return "";
		}
		String hh = "";
		if ('P' == s.charAt(8)) {
			hh = s.charAt(0) + "" + s.charAt(1);
			int tmp = Integer.parseInt(hh);
			tmp = (tmp + 12) % 24;
			hh = ""+tmp;
			if (hh.length() == 2) {
				hh = "" + hh;
			} else {
				hh = "0" + hh;
			}

		} else if ('A' == s.charAt(8)) {
			hh = s.charAt(0) + "" + s.charAt(1);
			int tmp = Integer.parseInt(hh);
			if (tmp == 12) {
				hh = "00";
			}
		}

		StringBuffer result = new StringBuffer(hh);

		for (int i = 2; i < 8; i++) {
			result.append(s.charAt(i));
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String result = timeConversion("07:05:45PM");
		System.out.println(result);
	}

}
