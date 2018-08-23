package linkedlist;

public class BasicLinkedList {

	public static void main(String[] args) {
		SingleNode head = LinkedListUtil.createLinkedList();
		int size = LinkedListUtil.getSize(head);
		System.out.println("Linked List Size "+size);
		LinkedListUtil.display(head);
		System.out.println("---- Done ----");
		LinkedListUtil.add(500);
		LinkedListUtil.add(200);
		LinkedListUtil.add(300);
	}
}
