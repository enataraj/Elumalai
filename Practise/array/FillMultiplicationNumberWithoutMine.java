package array;

import java.util.Arrays;

public class FillMultiplicationNumberWithoutMine {

	public FillMultiplicationNumberWithoutMine() {
		// TODO Auto-generated constructor stub
	}

	private static void findMultiplicationExceptMe(Integer[] a) {

		int total = 1;
		for (int i = 0; i < a.length; i++) {
			total = total * a[i];
		}

		for (int i = 0; i < a.length; i++) {
			a[i] = total / a[i];
		}
		System.out.println("Final Result : " + Arrays.deepToString(a));
	}

	private static void findMultiplicationExceptMeWithoutDiv(Integer[] a) {
		Integer[] prevProduct = new Integer[a.length];
		Integer[] nextProduct = new Integer[a.length];
		Integer[] result = new Integer[a.length];
		prevProduct[0] = 1;
		nextProduct[a.length - 1] = 1;

		// product of left side array
		for (int i = 1; i < a.length; i++) {
			prevProduct[i] = prevProduct[i - 1] * a[i - 1];
		}

		for (int j = a.length - 2; j >= 0; j--) {
			nextProduct[j] = a[j + 1] * nextProduct[j+1];
		}

		System.out.println("Prev Product : " + Arrays.deepToString(prevProduct));
		System.out.println("Next Product : " + Arrays.deepToString(nextProduct));

		for (int i = 0; i < a.length; i++) {
			result[i] = prevProduct[i] * nextProduct[i];
		}

		System.out.println("      Result : " + Arrays.deepToString(result));
	}
	
	
	public static void productExceptSelf(Integer[] nums) {
		Integer n = nums.length;
		Integer[] res = new Integer[n];
	    res[0] = 1;
	    for (int i = 1; i < n; i++) {
	        res[i] = res[i - 1] * nums[i - 1];
	    }
	    int right = 1;
	    for (int i = n - 1; i >= 0; i--) {
	        res[i] *= right;
	        right *= nums[i];
	    }
	    System.out.println("      Result : " + Arrays.deepToString(res));
	}
	

	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5};
		System.out.println("Input :" + Arrays.deepToString(a));
		findMultiplicationExceptMeWithoutDiv(a);
		productExceptSelf(a);
		findMultiplicationExceptMe(a);
	}

}
