package linkedlist;

public class MiddleElementIntheList {
	
	public static void middleElementList(){
		SingleNode head = LinkedListUtil.createLinkedList();
		LinkedListUtil.display(head);
		SingleNode slwPtr = head;
		SingleNode fastPtr = head;
		while(fastPtr.next!=null){
			slwPtr = slwPtr.next;
			fastPtr = fastPtr.next.next;
		}
		System.out.println("Middle Element : "+slwPtr.data);
	}
	
	public static void main(String[] args) {
		middleElementList();
	}

}
