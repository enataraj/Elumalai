/*
 * Remove Duplicate Number from the array
 */
public class RemoveDuplicateElementsInArray {
	
	public static void removeDuplicateElementsInArray(int[] array){
		int writeIndex = array.length;
		for(int i =0;i<array.length-1;i++){
			if(array[i] == array[i+1]){
				if(writeIndex == array.length){
				writeIndex = i+1;
				}
			}else{
				if(writeIndex!=array.length){
					array[writeIndex] =  array[i+1];
					writeIndex++;
				}
			}
		}
		
		for(int i=0;i<writeIndex;i++){
			System.out.println("Number in Array after removed duplicate : "+array[i]);
			
		}
	}

	public static void main(String[] args) {
		int[] array = {2,3,4,5,6,7};
		removeDuplicateElementsInArray(array);
	}
}
