package sorting;

public class DeafultSorting {

	public DeafultSorting() {
		// TODO Auto-generated constructor stub
	}

	private static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		
		print(a);
	}

	private static void print(int[] a){
		for(int i =0;i<a.length;i++){
		System.out.print("  "+a[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int a[] = { 4, 2, 5, 67, 3, 67, 84, 43, 4, 68, 2 };
		sort(a);
	}

}
