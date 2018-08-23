package eveningMeetup;

public class Flowers {

	public static void main(String[] args) {
		int a[] = { 0, 0, 1, 0, 0 };
		int count = 0;
		int i = 0;

		while (i < a.length) {
			if (a[i] == 0) {
				if (i + 2 < a.length) {
					if (a[i + 2] == 0) {
						if (a[i + 1] == 0) {
							i = i + 1;
						} else {
							i = i + 2;
						}
						count++;
					} else {
						i++;
					}
				} else {
					i++;

				}
			} else {
				i++;
			}
		}

		System.out.println("Count : " + count);
	}

}
