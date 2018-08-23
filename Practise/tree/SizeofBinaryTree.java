package tree;
public class SizeofBinaryTree {

	public SizeofBinaryTree() {
		// TODO Auto-generated constructor stub
	}

	private static int size(Node root) {
		if (root == null) {
			return 0;
		}
		System.out.println(root.data);
		return size(root.left) + 1 + size(root.right);
	}

	public static void main(String[] args) {
		BinaryTree tree = BinaryTree.getInstance();
		Node root = tree.constructTree3();
		int size = size(root);
		System.out.println("Size of Binary Tree " + size);
	}

}
