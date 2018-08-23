package list;

public class LoopInLinkedList {

	public LoopInLinkedList() {
		// TODO Auto-generated constructor stub
	}

	private static boolean findLoop(LinkedNode head) {
		if (head == null) {
			return false;
		}

		LinkedNode slow = head;
		LinkedNode fast = head;
		while (slow != null) {
			slow = slow.next;
			if (fast.next != null) {
				fast = fast.next.next;
			} else {
				return false;
			}

			if (slow == fast) {
				return true;
			}
		}
		return false;
	}
	
	private static void findLoopPosition(LinkedNode head){
		if(head==null){
			return;
		}
		
		LinkedNode slow = head;
		LinkedNode fast = head;
		
		while(fast!=null&& fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow==fast){
				break;
			}			
		}
		
		slow = head;
		while(slow!=fast ){
			slow = slow.next;
			fast = fast.next;
		}
		
		System.out.println("Loop in the List is : "+slow.data);
	}

	public static void main(String[] args) {
		LinkedList list = LinkedList.getInstance();
		LinkedNode head = list.defineList4();
		if (findLoop(head)) {
			System.out.println("It has Loop .. ");
			findLoopPosition(head);
		} else {
			System.out.println("No Loop..");
		}
		
		

	}

}
