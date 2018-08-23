package recurrsive;

import java.util.Stack;

import tobesolved.SingleNode;

public class ReversingLinkedlistUsingRecursion {
	
	// Recurrsion
	public static void reverse(SingleNode node){
		if(node!=null){
			System.out.println("Foorward : "+node.data);
			reverse(node.next);
			System.out.println("Reverse : "+node.data);
		}
		return;
	}
	
	// Stack approach
	public static void reverseUsingStack(SingleNode node){
		Stack<SingleNode> stack = new Stack<>();
		while(node!=null){
			stack.push(node);
			node = node.next;
		}
		
		while(!stack.isEmpty()){
			SingleNode popedNode = stack.pop();
			System.out.println(popedNode.data);
		}
	}
	
	
	public static void main(String[] args) {
		SingleNode head = new SingleNode();		
		head.data = 10;
		head.next = new SingleNode();
		head.next.data = 20;
		head.next.next = new SingleNode();
		head.next.next.data = 30;
		head.next.next.next = new SingleNode();
		head.next.next.next.data = 40;	
		reverse(head);
		reverseUsingStack(head);
	}

}
