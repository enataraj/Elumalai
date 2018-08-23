package tobesolved;

public class StringSwapCallByValue {

	private static void swap(String a, String b) {
		String temp = a;
		a = b;
		b = new String("ttt");

		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	
	private static void numSwap(int a,int b){
		int t = a;
		a =b;
		b=t;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
	}

	public static void main(String[] args) {
		String s1 = "Elumalai";
		String s2 = "Nishanth";
		System.out.println("before s1 : " + s1);
		System.out.println("before s2 : " + s2);
		swap(s1, s2);
		System.out.println("after s1 : " + s1);
		System.out.println("after s2 : " + s2);
		
		System.out.println("-----------------------");
		int n1 = 1;
		int n2 = 2;
		System.out.println("before n1 : " + n1);
		System.out.println("before n2 : " + n2);
		numSwap(n1, n2);
		System.out.println("after n1 : " + n1);
		System.out.println("after n2 : " + n2);
		
	}

}
