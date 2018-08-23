package list;

public class MergeTwoLinkedList {

	public MergeTwoLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	LinkedNode mergeLists(LinkedNode headA, LinkedNode headB) {
	     if(headA==null && headB==null){
	         return headA;
	     }
	    if(headA!=null && headB==null){
	        return headA;
	    }
	    if(headB!=null && headA==null){
	        return headB;
	    }
	    
	    LinkedNode newHead = null;
	    if(headA.data>headB.data){
	        newHead = headB;
	        headB = headB.next;
	    }else{
	        newHead = headA;
	        headA=headA.next;
	    }
	    LinkedNode newNode = newHead;
	    
	    while(headA!=null && headB!=null){
	        if(headA.data<=headB.data){
	            newNode.next = headA;
	            headA = headA.next;
	            
	        }else{
	            newNode.next = headB;
	            headB=headB.next;
	        }
	        newNode = newNode.next;
	    }
	    
	    while(headA!=null){
	        newNode.next = headA;
	        headA = headA.next;
	    }
	    
	    while(headB!=null){
	        newNode.next = headB;
	        headB = headB.next;
	    }
	    
	    return newHead;
	}	

	public static void main(String[] args) {
		LinkedList list = LinkedList.getInstance();
		LinkedNode head1 = list.defineList();
		LinkedNode head2 = list.defineList2();
		MergeTwoLinkedList mlist = new MergeTwoLinkedList();
		LinkedNode newHead = mlist.mergeLists(head1, head2);
		list.printList(newHead);
		
	}
}
