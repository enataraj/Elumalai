package tobesolved;

public class SortLinkedList {
	Node head;
	int size = 0;

	public SortLinkedList() {

	}

	public void addNode(int data) {
		if (head == null) {
			head = new Node();
			head.prev = null;
			head.next = null;
			head.data = data;
			size++;
		} else {
			Node end = new Node();
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = end;
			end.prev = current;
			end.data = data;
			end.next = null;
			size++;
		}

	}

	private int getSize() {
		return size;
	}

	public void sort() {
		Node startIndex1 = head;

		while (startIndex1 != null) {
			Node startIndex2 = head;
			while (startIndex2 != null) {
				if (startIndex1.data < startIndex2.data) {

					Node tmp = startIndex1;
					startIndex2 = startIndex1;
					startIndex1 = tmp;
					// if(a<b) temp = a; b=a; a=b;

				}
				startIndex2 = startIndex2.next;
			}
			startIndex1 = startIndex1.next;
		}

	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.println("Data " + current.data);
			current = current.next;
		}

	}

	public static void main(String[] args) {
		SortLinkedList ss = new SortLinkedList();
		ss.addNode(10);
		ss.addNode(20);
		ss.addNode(30);
		int size = ss.getSize();
		System.out.println("Size : " + size);
		ss.sort();
		ss.display();

	}

}
