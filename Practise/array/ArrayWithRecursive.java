package array;

public class ArrayWithRecursive {

	public ArrayWithRecursive() {
		// TODO Auto-generated constructor stub
	}

	private static void printArray(int[] arr, int n) {
		if (n < 0) {
			return;
		}
		printArray(arr, n - 1);
		System.out.println(arr[n]);
	}
	
private static void printArr(int[] arr){
	
}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		printArray(arr, arr.length - 1);
	}

}
