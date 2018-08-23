
public class SwapTwoNumbers {
public static void main(String[] args) {
	int a =10,b =5;
	System.out.println("Before Swap A : "+a+" B "+b);
	// By Arithmatic
	a= a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swap A : "+a+" B "+b);
	
	// by XOR
	a= a^b;
	b= b^a;
	a=a^b;
	System.out.println("After Swap A : "+a+" B "+b);
	
	
}
}
