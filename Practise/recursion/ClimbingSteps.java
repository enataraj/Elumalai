package recursion;

public class ClimbingSteps {

	public ClimbingSteps() {
		// TODO Auto-generated constructor stub
	}
	
	private static int possibleWaysToClaimb(int n){
		 if(n<0){
			 return 0;
		 }
		 if(n==0){
			 return 1;
		 }
		 
		 return possibleWaysToClaimb(n-1)+possibleWaysToClaimb(n-2)+possibleWaysToClaimb(n-3);
		
	}
	
	public static void main(String[] args) {
		int n = 3;
		int result = possibleWaysToClaimb(n);
		System.out.println("Possible Ways to Climb for N Steps "+result);
	}

}
