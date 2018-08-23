package tree;

import java.util.Stack;

public class InOrderIterative {

	public InOrderIterative() {
		// TODO Auto-generated constructor stub
	}

	private static void doInorder(Node root) {
		if (root == null) {
			return;
		}
		Node node = root;
		Stack<Node> stack = new Stack<>();
		while (node != null) {
			stack.push(node);
			node = node.left;
		}

		while (!stack.isEmpty()) {
			node = stack.pop();
			System.out.print("  " + node.data);
			if (node.right != null) {
				node = node.right;
				while (node != null) {
					stack.push(node);
					node = node.left;
				}
			}
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		BinaryTree tree = BinaryTree.getInstance();
		Node root = tree.constructTree1();
		doInorder(root);
	}
}
