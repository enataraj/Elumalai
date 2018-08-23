package example.tree;

public class TreeTraversalExample {

	public static void main(String[] args) {
		TreeUtil util = new TreeUtil();
		BinaryTreeNode root = new BinaryTreeNode(1);
		util.constructTree(root);
		System.out.println("Pre Oder Traversal : ");
		util.preOrderTraversal(root);
		System.out.println("\n ********* ");
		System.out.println(" In Order traversal :");
		util.inOrderTraversal(root);
		System.out.println("\n ************************ ");
		System.out.println(" Post Order Traversal :");
		util.postOrderTraversal(root);
		System.out.println("\n ************************");

		System.out.println("---------------------------------------------");
		TreeUtil util1 = new TreeUtil();
		BinaryTreeNode root1 = new BinaryTreeNode(10);
		util1.constructBinarySearchTree(root1);
		System.out.println("Pre Oder Traversal : ");
		util1.preOrderTraversal(root1);
		System.out.println("\n ********* ");
		System.out.println(" In Order traversal :");
		util1.inOrderTraversal(root1);
		System.out.println("\n ************************ ");
		System.out.println(" Post Order Traversal :");
		util1.postOrderTraversal(root1);
		System.out.println("\n ************************");

	}
}
