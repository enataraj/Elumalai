public class MaxFreqOfChar {

	public MaxFreqOfChar() {
		// TODO Auto-generated constructor stub
	}

	private static void findMaxFrequencyOfChar(String str) {
		int[] freqArra = new int[256];
		printArray(freqArra);

		int maxCount = 0;
		char maxRepeatedChar = ' ';
		for (char c : str.toCharArray()) {
			freqArra[c]++;
		}
		printFilteredArray(freqArra);

		for (char c : str.toCharArray()) {
			int count = freqArra[c];
			if (maxCount < count) {
				maxCount = count;
				maxRepeatedChar = c;

			}

		}

		System.out.println("maxRepeatedChar : " + maxRepeatedChar + "  " + maxCount);

	}

	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}

	private static void printFilteredArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				System.out.print(" " + a[i]);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String str = "Elumalai";
		findMaxFrequencyOfChar(str);
	}

}
