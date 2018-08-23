package tobesolved;

public class ReverseLinkedList {

	// keep current , next , prev pointer , keep go forward and assign the
	// previous

	int size;
	SingleNode head;

	public ReverseLinkedList() {
		head = new SingleNode();
		head.data = 0;
		size = 0;
	}

	public void add(int data) {
		SingleNode node = new SingleNode();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;

			size++;
		} else {
			SingleNode current = head;
			while (current.next != null) {
				current = current.next;
			}

			current.next = node;
			current.data = data;
			size++;

		}
	}

	public int getSize() {
		return size;
	}

	public void display() {
		SingleNode current = head;
		System.out.print("Node in the list :");
		while (current.next != null) {
			System.out.print(" " + current.data);
			current = current.next;
		}
	}
	
	public void reverseList(){
		SingleNode  prevLink;
		SingleNode currentNode = head; 
		while(currentNode.next!=null){
			prevLink = currentNode.next;
			currentNode.next = currentNode;
			
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.add(10);
		list.add(20);
		 list.add(30);
		 list.add(40);
		int size = list.getSize();
		System.out.println("Size of the List :" + size);
		list.display();

	}
}
