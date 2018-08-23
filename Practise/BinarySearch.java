
public class BinarySearch {
	
	public static boolean search(int[] a, int target){
		int low = 0;
		int high = a.length-1;
		
		
		// Target in between low and high , inclusive middle.
		while(low  <= high){
			int mid = (low+high) /2;
			if(target == a[mid]){
				return true;
			}
			
			if(target < a[mid]){
				high = mid-1; // if not it will become infinite loop
			}
			
			if(target > a[mid]){
				low = mid+1;
			}
			System.out.println("Low : "+low+" Hight :"+high);
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		System.out.println("Binay Search Program ");
		int[] a = {23,24,26,28,34,45,56,69};
		if(search(a,47)){
			System.out.println("Number exist in array");
		}else{
			System.out.println("Numer does not exist");
		}
	}

}
