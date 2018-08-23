package tobesolved;

import java.util.HashMap;
import java.util.Map;

// Clone Linked List with HashMap

public class CloneLinkedList {

	private SingleNode head;

	public SingleNode cloneNode() {
		Map<SingleNode, SingleNode> map = new HashMap<>();
		SingleNode newNode;
		SingleNode node = this.head;
		while (node != null) {
			newNode = new SingleNode();
			newNode.data = node.data;
			map.put(node, newNode);
			node = node.next;
		}

		node = this.head;
		while (node != null) {
			SingleNode currentNode = map.get(node);
			SingleNode nextNode = map.get(node.next);
			currentNode.next = nextNode;
			node = node.next;

		}

		return map.get(this.head);

	}

	public void display(SingleNode node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public void reverse() {
		SingleNode current = this.head;
		SingleNode prev = null;
		SingleNode next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		this.head = prev;

	}

	public static void main(String[] args) {
		CloneLinkedList list = new CloneLinkedList();
		SingleNode head = new SingleNode();
		list.head = head;
		head.data = 10;
		head.next = new SingleNode();
		head.next.data = 20;
		head.next.next = new SingleNode();
		head.next.next.data = 30;
		head.next.next.next = new SingleNode();
		head.next.next.next.data = 40;
		System.out.println("nitial list");
		list.display(list.head);
		System.out.println("-- Clone ---");
		list.display(list.cloneNode());
		System.out.println("--- Reverse ----");		
		list.reverse();
		list.display(list.head);

	}

}
