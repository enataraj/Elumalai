package sorting;

public class QuickSort {

	public QuickSort() {
		// TODO Auto-generated constructor stub
	}

	
	private static int partition(int a[], int low, int high) {
		int i = low - 1;
		int pivot = a[high];
		// Just Move the element less than pivot front side of the array. 
		for (int j = low; j < high; j++) {
			if (a[j] <= pivot) {
				i++;
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		int t = a[i + 1];
		a[i + 1] = a[high];
		a[high] = t;
		
		System.out.println("Partitions ");
		for (int k = 0; k < a.length; k++) {
			System.out.print("  "+a[k]);
		}
		System.out.println();
		return i + 1;
	}

	private static void sort(int a[], int low, int high) {
		if (low < high) {
			int pIndex = partition(a, low, high);
			sort(a, low, pIndex - 1);
			sort(a, pIndex + 1, high);
		}

	}

	public static void main(String[] args) {
		int a[] = { 2, 5, 1, 6, 2, 7, 794, 23, 2454, 34, 23, 5, 6 };
//		int a[] = {1,2,3,4,5,6};
		System.out.println("Input  : ");
		for (int k = 0; k < a.length; k++) {
			System.out.print("  "+a[k]);
		}
		System.out.println();		
		sort(a, 0, a.length - 1);
		System.out.println("Result ");
		for (int k = 0; k < a.length; k++) {
			System.out.print("  "+a[k]);
		}
		System.out.println();
	}

}
