package example.tree;

public class CloneTree {

	public static void main(String[] args) {
		TreeUtil util = new TreeUtil();
		BinaryTreeNode root = new BinaryTreeNode(10);
		util.constructBinarySearchTree(root);
		BinaryTreeNode newRoot = util.cloneTree(root);
		System.out.println("root : " + root.toString());
		System.out.println("New root : " + newRoot.toString());

		System.out.println("Actual Tree : ");
		util.inOrderTraversal(root);

		System.out.println("\n After Clone : ");
		util.inOrderTraversal(newRoot);

	}

}
