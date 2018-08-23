import java.util.Arrays;
import java.util.Comparator;

public class FindMaxNumberFromArrayOfNumbers {

	public static void printMaxNum(Integer a[]) {
		Arrays.sort(a, new NumberComparator());
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

	public static void main(String[] args) {
		Integer[] a = { 54, 546, 548, 60 };
		Integer[] b = { 1, 34, 3, 98, 9, 76, 45, 4 };
		System.out.println("Max Number :");
		printMaxNum(a);
		System.out.println("\nMax Number :");
		printMaxNum(b);

	}

}

class NumberComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		String first = o1.toString() + o2.toString();
		String second = o2.toString() + o1.toString();
		if (Integer.parseInt(first) < Integer.parseInt(second)) {
			return 1;
		} else {
			return -1;
		}

	}

}