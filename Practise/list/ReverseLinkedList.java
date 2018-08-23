package list;

import java.util.Stack;

public class ReverseLinkedList {

	LinkedNode head = null;
	public ReverseLinkedList() {
		// TODO Auto-generated constructor stub
	}

	private LinkedNode reverseUsingStack(LinkedNode head) {
		LinkedNode node = head;
		LinkedNode newHead = null;
		LinkedNode newNode = null;

		Stack<LinkedNode> stack = new Stack<>();
		while (node != null) {
			stack.push(node);
			node = node.next;
		}

		while (!stack.isEmpty()) {
			LinkedNode n = stack.pop();
			if (newHead == null) {
				newHead = n;
				newNode = newHead;
			} else {
				newNode.next = n;
				newNode = newNode.next;
			}
		}
		newNode.next = null;
		return newHead;
	}

	private LinkedNode reverseLinkedList(LinkedNode head) {
		LinkedNode current = head;
		LinkedNode prev = null;
		LinkedNode next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	private  LinkedNode reverseUsingRecursive(LinkedNode curr, LinkedNode prev) {
		
		if (curr.next == null) {
			head = curr;
			curr.next = prev;
			return null;
		}

		LinkedNode next = curr.next;
		curr.next = prev;
		reverseUsingRecursive(next, curr);
		return head;

	}

	public static void main(String[] args) {
		LinkedList list = LinkedList.getInstance();
		LinkedNode head = list.defineList2();
		list.printList(head);
		ReverseLinkedList rlist = new ReverseLinkedList();
		// LinkedNode newHead = rlist.reverseUsingStack(head);
		// list.printList(newHead);
		//head = list.defineList3();
		//LinkedNode newHead1 = rlist.reverseLinkedList(head);
		LinkedNode newHead1 = rlist.reverseUsingRecursive(head, null);
		list.printList(newHead1);
	}

}
