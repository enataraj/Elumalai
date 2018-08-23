package tree;

public class HeightOfBinarytree {

	public HeightOfBinarytree() {
		// TODO Auto-generated constructor stub
	}

	private static int height(Node root) {

		if (root == null) {
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		if (leftHeight > rightHeight) {
			return leftHeight + 1;
		}
		return rightHeight + 1;
	}

	public static void main(String[] args) {
		BinaryTree tree = BinaryTree.getInstance();
		Node root = tree.constructTree1();
		int height = height(root);
		System.out.println(height);

	}

}
