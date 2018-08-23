package tobesolved;

public class RotateArrayTillKPosition {

	public static void rotateArray(int a[], int k) {
		int length = a.length-1;
		k=k-1;
		for (int i = 0; i < k; i++) {
			int temp = a[length];
			a[k] = a[i];
			a[i] = temp;
		}
		
	}
	
	public static void main(String[] args) {
		int a[] = {0,1,2,3,4,5,6};
		MyUtil.printArray(a);
		rotateArray(a, 3);
		MyUtil.printArray(a);
	}

}
