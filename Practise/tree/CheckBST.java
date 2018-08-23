package tree;

public class CheckBST {

	public CheckBST() {
		// TODO Auto-generated constructor stub
	}

	private static boolean isBST(Node root) {
		if (root == null) {
			return false;
		}

		if (isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
			System.out.println("Binary Search Tree");
			return true;
		} else {
			System.out.println("Not Binary Search Tree");
			return false;
		}

	}

	private static boolean isBSTUtil(Node node, int min, int max) {
		if (node == null) {
			return true;
		}

		if (node.data < min || node.data > max) {
			return false;
		}

		return isBSTUtil(node.left, min, node.data - 1) && isBSTUtil(node.right, node.data + 1, max);
	}

	public static void main(String[] args) {
		BinaryTree tree = BinaryTree.getInstance();
		Node node = tree.constructBSTree();
		isBST(node);

	}

}
