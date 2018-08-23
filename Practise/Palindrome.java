
public class Palindrome {
	public static void main(String[] args) {
		String str = "babcbab";
		for(int i=0,j=str.length()-1;i<j;i++,j--){
			if(str.charAt(i)!=str.charAt(j)){
				System.out.println("Not Polindrome ");
				return;
			}
			
		}
		System.out.println("Palindrome");
	}
}
