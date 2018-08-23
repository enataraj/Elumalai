package tobesolved;

public class FindWeight {

	public static int findWeight(int a[]) {

		MyUtil.printArray(a);
		if (a.length < 2) {
			return 0;
		}

		int sum = a[0] + a[1];
		int b[] = new int[a.length - 1];
		int k = 0;
		for (int i = 2; i < a.length; i++) {
			b[k++] = a[i];
		}
		b[a.length - 2] = sum;
		return sum + findWeight(b);
	}

	public static void main(String[] args) {
		int a[] = { 1,2,3 };
		int result = findWeight(a);
		System.out.println("Result : " + result);
		/*
		 * for(int i = 0;i<a.length-1;i++){ int j = i+1; int sum = a[i]+a[j];
		 * int b[] = new int[a.length-1]; int l=0; for(int k=2;k<a.length;k++){
		 * b[l++] = a[k]; } b[a.length-2] = sum; MyUtil.printArray(b); }
		 */
	}

}
