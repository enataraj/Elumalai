import java.util.Stack;

public class QueueImplementationUsingStack {
	static Stack<Integer> stack1 = new Stack<>();
	static Stack<Integer> stack2 = new Stack<>();

	public QueueImplementationUsingStack() {
		// TODO Auto-generated constructor stub
	}

	private static void pop() {
		if (stack1 != null && !stack1.isEmpty()) {
			int data = stack1.pop();
			System.out.println("Poped : " + data);
		}
	}

	private static void add(int data) {

		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		stack1.push(data);
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}

	public static void main(String[] args) {
		System.out.println(stack1);
		add(10);
		System.out.println(stack1);
		add(20);
		System.out.println(stack1);
		add(30);
		System.out.println(stack1);
		pop();
		System.out.println(stack1);
		pop();
		System.out.println(stack1);
		add(40);
		System.out.println(stack1);
		add(50);
		System.out.println(stack1);
		pop();
		System.out.println(stack1);
		
	}
}
