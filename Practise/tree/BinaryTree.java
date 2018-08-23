package tree;

public class BinaryTree {

	private static BinaryTree instance = new BinaryTree();

	private BinaryTree() {
		// TODO Auto-generated constructor stub
	}

	public static BinaryTree getInstance() {
		if (instance == null) {
			instance = new BinaryTree();
		}
		return instance;
	}

	public Node constructBSTree() {
		Node root = new Node(40);
		root.left = new Node(20);
		root.right = new Node(70);
		root.left.left = new Node(10);
		root.left.right = new Node(25);
		root.right.left = new Node(55);
		root.right.right = new Node(80);
		root.right.right.right = new Node(100);
		root.right.right.right.right = new Node(120);
		root.right.right.right.right.left = new Node(115);
		return root;
	}

	public Node constructTree1() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.right = new Node(8);
		root.right.right.right.right = new Node(9);
		root.right.right.right.right.left = new Node(10);
		root.right.right.right.right.left.left = new Node(11);

		return root;
	}

	public Node constructTree2() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.right = new Node(8);
		root.right.right.right.right = new Node(9);
		root.right.right.right.right.left = new Node(10);
		root.right.right.right.right.right = new Node(11);

		return root;
	}

	public Node constructTree3() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.left = new Node(8);
		root.right.left.left.left = new Node(9);
		return root;
	}

	public Node constructTree4() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		return root;
	}
}

class Node {
	int data = 0;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}

	@Override
	public String toString() {

		return "" + data;
	}
}
