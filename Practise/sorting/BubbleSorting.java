package sorting;

public class BubbleSorting {

	public BubbleSorting() {
		// TODO Auto-generated constructor stub
	}
	
	
	private static void bubblesort(int[] a){
		for(int i = 0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				
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
		bubblesort(a);
	}

}
