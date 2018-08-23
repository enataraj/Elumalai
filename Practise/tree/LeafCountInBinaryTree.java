package tree;

public class LeafCountInBinaryTree {

	public LeafCountInBinaryTree() {
		// TODO Auto-generated constructor stub
	}
	
	private static void findLeafCount(Node root){
		
		int count = findCount(root);
		System.out.println("Count  : "+count);
	}
	
	private static int findCount(Node root){
		if(root == null){
		return 0;
		}
		
		if(root.left==null && root.right==null){
			return 1;
		}
		
		return findCount(root.left)+findCount(root.right);
		
		
		
	}
	
	public static void main(String[] args) {
		BinaryTree tree = BinaryTree.getInstance();
		Node root = tree.constructTree1();
		findLeafCount(root);
	}

}
