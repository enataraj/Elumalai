package array;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardResizeToggleHandler;

public class KthLargestNumberInArray {

	public KthLargestNumberInArray() {
		// TODO Auto-generated constructor stub
	}

	// Using sorting
	private static void findKthLargestNumber(int[] a, int k) {
		if (a == null || a.length <= 0 || k > a.length) {
			System.out.println("Number is not available");
			return;
		}

		Arrays.sort(a);
		;
		System.out.println(a[k - 1]);
	}

	private static int findKthLargestNumber(int a[], int l, int r, int k) {
		if (a == null || a.length <= 0 || a.length < k) {
			return Integer.MAX_VALUE;
		}

		int kthlargest = Integer.MAX_VALUE;
		
		return kthlargest;
	}
	
	// Using Priority Queue
	
	private static void findKthLargestNumberPQ(int a[],int k){
		if (a == null || a.length <= 0 || a.length < k) {
			System.out.println("Numver is now exist ");
			return;
		}
		
		Queue<Integer> q = new PriorityQueue<>();
		for(int i=0;i<a.length;i++){
			System.out.println("Adding : "+a[i]);
			q.offer(a[i]);	
			
			if(q.size() > (a.length-k)){
				
				int remo = q.poll();
				System.out.println("Removing "+remo);
			}
		}
		
		int kthLargest = q.remove();
		System.out.println(q);
		System.out.println("Kth Largest : "+kthLargest);
		
	}

	public static void main(String[] args) {
		int[] a = { 4, 2,2, 5, 7, 2, 4, 6, 7 };
		int k = 2;
		
//		findKthLargestNumber(a, k);
		findKthLargestNumberPQ(a,k);
	}
}
