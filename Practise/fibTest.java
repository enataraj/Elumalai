
public class fibTest {

	public fibTest() {
		// TODO Auto-generated constructor stub
	}
	
	private static int findFibo(int n){
		if(n==0||n==1){
			return 1;
		}
		
		return findFibo(n-1)+findFibo(n-2);
	}
	public static void main(String[] args) {
		
		int n = 5;
		for(int i=0;i<n;i++){
		int fib = findFibo(i);
		System.out.println(fib);
		}
	}

	// 0 1 1 2 3 5 8
}
