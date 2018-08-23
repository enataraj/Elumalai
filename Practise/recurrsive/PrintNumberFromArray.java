package recurrsive;

public class PrintNumberFromArray {

	public static void printNumbers(int a[], int i) {
		if (i < a.length) {
			System.out.println("Number In Array : " + a[i]);
			printNumbers(a, i+1);
		}
	}

	public static void main(String[] args) {
		int a[] = { 1,2,3,4,5,6 };
		printNumbers(a, 0);
	}
}
