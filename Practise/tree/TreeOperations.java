package tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeOperations {

	public TreeOperations() {
		// TODO Auto-generated constructor stub
	}

	private static void preOrderTraversal(Node root) {

		if (root == null)
			return;
		System.out.print("  " + root.data);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}

	private static void postOrderTraversal(Node root) {

		if (root == null)
			return;

		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print("  " + root.data);
	}

	private static void inOrderTraversal(Node root) {

		if (root == null)
			return;

		inOrderTraversal(root.left);
		System.out.print("  " + root.data);
		inOrderTraversal(root.right);
	}

	private static void inOrderTraversalWithOutRecursion(Node root) {
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
	}

	private static void levelOrderTraversal(Node root) {
		if (root == null)
			return;

		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.print(" " + node.data);
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}

	}

	public static void main(String[] args) {
		BinaryTree tree = BinaryTree.getInstance();
		Node root = tree.constructTree1();
		System.out.println("Pre Oder : ");
		preOrderTraversal(root);
		root = tree.constructTree1();
		System.out.println("\nPost Order :");
		root = tree.constructTree1();
		postOrderTraversal(root);
		System.out.println("\nIn Order : ");
		inOrderTraversal(root);
		System.out.println("\nIn Order : ");
		inOrderTraversalWithOutRecursion(root);
		System.out.println("\n Level Order Traversal ");
		tree = BinaryTree.getInstance();
		root = tree.constructTree2();
		levelOrderTraversal(root);
	}

}
