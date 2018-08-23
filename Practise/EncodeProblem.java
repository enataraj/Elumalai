import java.util.Stack;

public class EncodeProblem {

	public EncodeProblem() {
		// TODO Auto-generated constructor stub
	}

	private static void decode(String encode) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < encode.length(); i++) {
			if (']' != encode.charAt(i)) {
              stack.push(encode.charAt(i));
              System.out.println(stack);
			}else{
				while('['!=)
				if()
			}
		}

	}

	public static void main(String[] args) {
		String str = "3[a]";
		decode(str);
	}

}
