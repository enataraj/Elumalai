
/*
 * In the Given Array of Integers arrange Even Number first and Odd Number second 
 * 
 */


public class ArrangeOddAndEvenNumber {
	
	public static void arrangeEvenOdd(int[] array){
		int nextodd = array.length-1;
		int nexteven = 0;
		while(nexteven < nextodd){
			if(array[nexteven] %2==0){
				nexteven++;
			}else{
				int temp = array[nexteven];
				array[nexteven] = array[nextodd];
				array[nextodd] = temp;
				nextodd--;
			}
		}	
		
		
		
		for(int i=0;i<array.length;i++){
			System.out.println("Numbers in the Array : "+array[i]);
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {3,2,5,6,2,8,3,7};
		arrangeEvenOdd(array);
	}

}
