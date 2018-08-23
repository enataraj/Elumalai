package list;

public class FindKthNodeFromLast {

	public FindKthNodeFromLast() {
		// TODO Auto-generated constructor stub
	}

	private static int findKthNodeFromLast(LinkedNode head, int k) {
		LinkedNode node = head;
		LinkedNode endNode = head;
		int i = 0;
		while (i <= k) {
			endNode = endNode.next;
			i++;
		}

		while (endNode != null) {
			endNode = endNode.next;
			node = node.next;
		}
		System.out.println("Kth Node from last : " + node.data);
		return node.data;
		

	}

	public static void main(String[] args) {
		LinkedList list = LinkedList.getInstance();
		LinkedNode head = list.defineList();
		list.printList(head);
		
		for(int i=1;i<6;i++)
		findKthNodeFromLast(head, i);
		
	}
}
