package list;

public class FindMiddleNode {

	public FindMiddleNode() {
		// TODO Auto-generated constructor stub
	}

	private static void findMiddleNode(LinkedNode head){
		
		LinkedNode slowNode = head;
		LinkedNode fastNode = head;
		
		while(fastNode!=null && fastNode.next!=null){
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
		}
		System.out.println("Middle Node : "+slowNode.data);
	}
	public static void main(String[] args) {
		LinkedList list = LinkedList.getInstance();
		LinkedNode node = list.defineList2();
		list.printList(node);
		findMiddleNode(node);
		
	}
}
