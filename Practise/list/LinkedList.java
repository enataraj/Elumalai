package list;

public class LinkedList {
	private static LinkedList instance = new LinkedList();

	private LinkedList() {
		// TODO Auto-generated constructor stub
	}

	public static LinkedList getInstance() {
		if (instance == null) {
			instance = new LinkedList();
		}
		return instance;
	}

	public void printList(LinkedNode head) {
		LinkedNode node = head;
		System.out.println("List Value : ");
		while (node != null) {
			System.out.print(" " + node.data);
			node = node.next;
		}
		System.out.println();
	}

	public LinkedNode defineList() {
		LinkedNode node = new LinkedNode(10);
		node.next = new LinkedNode(20);
		node.next.next = new LinkedNode(30);
		node.next.next.next = new LinkedNode(40);
		node.next.next.next.next = new LinkedNode(50);
		node.next.next.next.next.next = new LinkedNode(60);
		return node;
	}

	public LinkedNode defineList2() {
		LinkedNode node = new LinkedNode(5);
		node.next = new LinkedNode(10);
		node.next.next = new LinkedNode(20);
		node.next.next.next = new LinkedNode(23);
		node.next.next.next.next = new LinkedNode(30);
		node.next.next.next.next.next = new LinkedNode(40);
		node.next.next.next.next.next.next = new LinkedNode(60);
		return node;
	}
	
	public LinkedNode defineList4() {
		LinkedNode node = new LinkedNode(10);
		node.next = new LinkedNode(20);
		node.next.next = new LinkedNode(30);
		node.next.next.next = new LinkedNode(40);
		node.next.next.next.next = new LinkedNode(50);
		node.next.next.next.next.next = new LinkedNode(60);
		node.next.next.next.next.next.next = new LinkedNode(70);
		node.next.next.next.next.next.next = node.next.next.next.next.next;
		return node;
	}


	public LinkedNode defineList3() {
		LinkedNode node = new LinkedNode(10);
		return node;
	}
}

class LinkedNode {
	int data;
	LinkedNode next;

	public LinkedNode(int data) {
		this.data = data;
		this.next = null;
	}
}