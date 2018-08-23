package array;

import java.util.Arrays;

public class RemoveDuplicateSortedArray {

	public RemoveDuplicateSortedArray() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Integer a[] = {1,3,3,3,4,5,5,5,5,6,7,8,9};
		int j=0;
		for(int i=0;i<a.length-1;i++){
			if(a[i]!=a[i+1]){
				a[j]=a[i];
				j++;
			}
		
		}
		a[j]=a[a.length-1];
		System.out.println(Arrays.deepToString(a));
	}

}
