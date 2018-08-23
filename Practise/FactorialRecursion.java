
public class FactorialRecursion {
	
	private static int count = 0;
	
	private int fact(int n){
		System.out.println(" Print Count : "+count++);
		if(n>0){
			if(n==0){
				return 1;
			}
			System.out.println(" Finding n-1 ==> "+(n-1));
			System.out.println(" Finding (n-1 * n) ==> "+((n-1)*n));
			return fact(n-1)*n;
		}else{
			return 1;
		}
	}

	public static void main(String[] args) {
		int result = new FactorialRecursion().fact(3);
		System.out.println("Result : "+result);
	}
}
