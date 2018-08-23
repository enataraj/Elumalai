package linkedlist;

import java.util.Random;

public class LinkedListUtil {

	public static SingleNode createLinkedList() {

		Random ran = new Random();
		SingleNode head = new SingleNode(ran.nextInt(100), null);
		SingleNode newNode1 = new SingleNode(ran.nextInt(100), null);
		head.next = newNode1;
		SingleNode newNode2 = new SingleNode(ran.nextInt(100), null);
		newNode1.next = newNode2;
		SingleNode newNode3 = new SingleNode(ran.nextInt(100), null);
		newNode2.next = newNode3;
		SingleNode newNode4 = new SingleNode(ran.nextInt(100), null);
		newNode3.next = newNode4;
		SingleNode newNode5 = new SingleNode(ran.nextInt(100), null);
		newNode4.next = newNode5;
		return head;
	}

	public static void display(SingleNode node) {
		while (node!= null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public static int getSize(SingleNode node) {
		int size = 0;
		while (node.next != null) {
			size++;
			node = node.next;
		}
		return size;
	}

	public static void add(int number) {
		SingleNode newNode = new SingleNode(number, null);
		SingleNode head = createLinkedList();
		System.out.println("Before Add ");
		display(head);
		SingleNode node = head;
		while (node.next != null) {
			node = node.next;
		}
		node.next = newNode;
		System.out.println("After Add ");
		display(head);
	}

}
