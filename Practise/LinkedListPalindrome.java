import java.util.Stack;

public class LinkedListPalindrome {

	public LinkedListPalindrome() {

	}

	private boolean isPalindrom(Node head) {
		boolean isPalindrom = false;
		Node node = head;
		Stack<Node> stack = new Stack<>();
		while (node != null) {
			System.out.println(node.data);
			stack.push(node);
			node = node.next;
		}

		while (!stack.isEmpty()) {
			System.out.println("inside...");
			Node newNode = stack.pop();
			if (!(newNode.data == head.data)) {
				System.out.println("false...");
				return false;
			}
			head = head.next;

		}
		return true;

	}

	public static void main(String[] args) {
		Node head = new Node();
		head.data = 'A';
		head.next = new Node();
		head.next.data = 'B';
		head.next.next = new Node();
		head.next.next.data = 'A';

		boolean flag = new LinkedListPalindrome().isPalindrom(head);
		System.out.println(flag);

	}

}

class Node {
	char data;
	Node next;

}