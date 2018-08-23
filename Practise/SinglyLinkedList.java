
public class SinglyLinkedList {
	public Node head = null;
	public int listCount;

	public SinglyLinkedList() {
		head = new Node(0);
		listCount = 0;
	}

	public void add(int data) {
		Node end = new Node(data);
		Node current = head;

		while (current.next != null) {
			current = current.next;
		}

		current.next = end;
		listCount++;
	}

	public void add(int data, int index) {
		Node current = head;
		Node end = new Node(data);

		if (index > listCount || index < 0) {
			System.err.println("index is out of boundary");
			return;
		}

		int move = 0;

		while (move < index) {
			current = current.next;
			move++;
		}

		if (move == index) {
			end.next = current.next;
			current.next = end;
			listCount++;
		}
	}

	public void display() {
		Node current = head;
		while (current.next != null) {
			System.out.println("Data " + current.next.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50, 2);
		list.add(60, 2);
		list.display();
	}
}

class Node {
	Node next = null;
	int data;

	public Node(int data) {
		this.data = data;
	}

}