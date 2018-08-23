package array;

public class PartitionPivot {

	public PartitionPivot() {
		// TODO Auto-generated constructor stub
	}

	private static int[] partitionPivot(int a[],int pivotIndex) {

		int lenght = a.length;
		int pivot = a[pivotIndex];
		
		for (int i = 0; i < lenght - 2; i++) {
			if (a[i] > pivot) {
				swap(a, i, pivotIndex);
				pivotIndex--;
			}
		}
		print(a);
		return a;
	}

	private static void print(int a[]) {
		System.out.println();
		for (int num : a) {
			System.out.print("  " + num);
		}
	}

	private static void swap(int a[], int left, int right) {
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}

	public static void main(String[] args) {
		int a[] = { 3, 2, 6, 2, 23, 6, 8, 3, 2, 7, 8 };
		print(a);
		partitionPivot(a,4);

	}

}
