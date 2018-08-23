import java.util.Stack;

public class ReverseWord {

	public ReverseWord() {
		// TODO Auto-generated constructor stub
	}

	private static void reverseWordUsingStack(String sentence) {
		String[] strArray = sentence.split(" ");
		Stack<String> stack = new Stack<>();
		for (String str : strArray) {
			stack.push(str);
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

	private static void reverseSentence(String str){
		str = reverse(str,0,str.length()-1);
		int left = 0;
		int right = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				right = i;
//				System.out.println("Before : "+str);
				str =reverse(str, left, right);
//				System.out.println("After : "+str);
				left = i+1;
			}			
			
		}
		
		System.out.println(str);
		
		
	}

	private static String reverse(String str, int left, int right) {

		char[] tempArray = str.toCharArray();

		while (left < right) {
			char ch1 = tempArray[left];
			tempArray[left] = tempArray[right];
			tempArray[right] = ch1;
			left++;
			right--;
		}

		str = new String(tempArray);
//		System.out.println(str);
		return str;

	}

	public static void main(String[] args) {
		String str = "I am Elumalai test";
		reverseSentence(str);
		

	}

}
