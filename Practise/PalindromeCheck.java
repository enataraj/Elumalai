import java.util.Scanner;

public class PalindromeCheck {

	public static boolean canPermutePalindrome(String s) {
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
        	arr[s.charAt(i)]++;
        }
        int count = 0;
        for (int key = 0; key < arr.length && count <= 1; key++) {
            count += arr[key] % 2;            
        }
        return count <= 1;
    }
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
	    if(s.equals("1")){
	    	break;
	    }
		if(canPermutePalindrome(s)){
			System.out.println("Palindrome");
		}else{
			System.out.println("! Palindrome");
		}
		}
	}


}
