package tobesolved;

public class MergeSort {

	public void sort(int arr[], int l, int r) {
		if (l < r) {
			int middle = (l + r) / 2;

			sort(arr, l, middle);
			sort(arr, middle + 1, r);
			merge(arr, l, r, middle);

		}

	}

	public void merge(int[] arr, int l, int r, int m) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[l + i];
		}
		System.out.println("Inside --");

		printArray(L);

		for (int j = 0; j < n2; j++) {
			R[j] = arr[m + 1 + j];
		}
		printArray(R);

		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}

		System.out.println("Inside Merge ");
		printArray(arr);

	}

	public void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();

	}

	public static void main(String[] args) {
		MergeSort sort = new MergeSort();
		int[] arr = { 3, 2, 5, 34, 64, 232, 43, 6 };
		sort.printArray(arr);
		sort.sort(arr, 0, arr.length - 1);
		sort.printArray(arr);

	}
}
