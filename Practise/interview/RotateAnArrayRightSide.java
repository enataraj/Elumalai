package interview;

import tobesolved.MyUtil;

public class RotateAnArrayRightSide {

	public static void bruteforce(int a[], int k) {
		k = k % a.length;
		for (int i = 0; i < k; i++) {
			int last = a[a.length - 1];
			for (int j = 0; j < a.length; j++) {
				int temp = a[j];
				a[j] = last;
				last = temp;
			}
			MyUtil.printArray(a);
		}
	}

	public void brutForceWithExtraSpace(int a[], int k) {
		k = k % a.length;
		System.out.println("K " + k);
		int b[] = new int[a.length];
		int j = 0;
		for (int i = a.length - k; i < a.length; i++) {
			b[j] = a[i];
			j++;
		}

		MyUtil.printArray(b);

		for (int x = 0; x < a.length - k; x++) {
			b[j] = a[x];
			j++;
		}

		MyUtil.printArray(b);
	}

	public static void extraArrayRightShift(int a[], int k) {

		int res[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int index = (k + i) % a.length;
			res[index] = a[i];
		}
		MyUtil.printArray(res);
	}

	public static void reverseMethod(int a[], int k) {
		k = k % a.length;

		int i = 0;
		int j = a.length - 1;
		// reverse the whole array
		while (i < j) {
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;
			i++;
			j--;
		}
		
		MyUtil.printArray(a);
		// reverse first k element
		i = 0;
		j=k-1;
		
		while(i<j){
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;
			i++;
			j--;		
			
		}
		
		MyUtil.printArray(a);
		
		// reverse k to n
		
		i = k;
		j=a.length-1;
		
		while(i<j){
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;
			i++;
			j--;		
			
		}
		
		MyUtil.printArray(a);
		
		

	}

	private static void reverse() {

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 4;

		// extraArrayMethod2(a, k);
		reverseMethod(a, k);

	}

}
