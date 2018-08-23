package pramp;

public class Decryption {

	public Decryption() {
		// TODO Auto-generated constructor stub
	}

	private static String doEncrypt(String msg) {
		if (msg == null) {
			return "";
		}

		// convert Ascii
		// add 1 to first and from second to end add previous ascii
		// subtract till 26 until it will become ascii range
		// convert string

		int[] asciiMsg = new int[msg.length()];
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < msg.length(); i++) {
			asciiMsg[i] = msg.charAt(i);
		}
		asciiMsg[0] = asciiMsg[0] + 1;
		for (int i = 1; i < asciiMsg.length; i++) {
			asciiMsg[i] = asciiMsg[i - 1] + asciiMsg[i];
		}

		for (int i = 0; i < asciiMsg.length; i++) {
			int tmp = asciiMsg[i];
			// System.out.println(" s "+tmp);
			while (97 <= tmp && tmp >= 123) {
				tmp = tmp - 26;
			}
			// System.out.println(tmp);
			char c = (char) tmp;
			sb.append("" + c);
		}
		return sb.toString();
	}

	private static String doDecrypt(String msg) {
		if (msg == null || msg.isEmpty()) {
			return "";
		}
		int[] asciiMsg = new int[msg.length()];
		int[] resMsg = new int[msg.length()];
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < msg.length(); i++) {
			asciiMsg[i] = msg.charAt(i);
		}

		resMsg[0] = asciiMsg[0] - 1;
		for (int i = 0; i < asciiMsg.length - 1; i++) {
			resMsg[i + 1] = asciiMsg[i + 1] - asciiMsg[i];
			// System.out.println("resM "+ resMsg[i+1]);
		}
		char c = (char) resMsg[0];
		sb.append("" + c);

		for (int i = 1; i < resMsg.length; i++) {
			int tmp = resMsg[i];
			// System.out.println(" s "+tmp);
			while (tmp < 97 && 122 > tmp) {
				tmp = tmp + 26;
			}
			// System.out.println("after change : "+tmp);
			c = (char) tmp;
			sb.append("" + c);
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		String str = "crime";
		String ency = doEncrypt(str);
		System.out.println(ency);
		String decy = doDecrypt(ency);
		System.out.println(decy);

	}

}
