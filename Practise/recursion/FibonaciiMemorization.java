package recursion;

public class FibonaciiMemorization {

	public FibonaciiMemorization() {
		// TODO Auto-generated constructor stub
	}
	
	private static void findFibnocii(int n){
		int result[] = new int[n];
		generateFibnocii(n-1,result);
		for(int i=0;i<result.length;i++){
			System.out.print("  "+result[i]);
		}
		System.out.println();
	}
	
	private static int generateFibnocii(int n,int[] result){
		if( n==0){
			return 0;
		}
		
		if(n==1){
			return 1;
		}
		
		return result[n] = generateFibnocii(n-1,result)+generateFibnocii(n-2,result);
	}
	public static void main(String[] args) {
		findFibnocii(10);
	}

}
