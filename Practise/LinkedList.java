
public class LinkedList {
	Node head;
	int size = 0;

	public LinkedList() {

	}

	public void add(int data) {
		if (head == null) {
			head = new Node(data, null);
			size = 1;
			return;
		}
		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		node.next = new Node(data, null);
		size = size + 1;
	}

	public void display() {
		Node node = head;
		while (node != null) {
			System.out.print(" " + node.data);
			node = node.next;
		}
	}

	public int getSize() {
		return size;
	}

	public void remove(int index) throws Exception {
		Node node = head;
		Node preNode = null;
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}

		if (size == 1 && index == 0) {
			head = null;
			return;
		}

		if (index == 0) {
			head = node.next;
			return;

		}

		if (size == index + 1) {
			while (node.next != null) {
				node = node.next;
			}
			node = null;

		}

		while (index != 0) {
			preNode = node;
			node = node.next;
			--index;
		}
		preNode.next = node.next.next;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(3);
		list.add(4);
		list.add(5);
		list.display();
		System.out.println();
		int size = list.getSize();
		System.out.println("Size : " + size);

		list.add(5);
		size = list.getSize();
		System.out.println("Size : " + size);

		//
		try {
			System.out.println("before delete :");
			list.display();
			System.out.println("Delete Post 0");
			// list.remove(0);
			list.remove(3);
			list.display();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

}
