package example.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TreeUtil {

	public void constructTree(BinaryTreeNode root) {
		// root
		if (root == null) {
			root = new BinaryTreeNode(1);
		}
		// First Child
		root.leftNode = new BinaryTreeNode(2);
		root.rightNode = new BinaryTreeNode(3);

		// Second Child
		root.leftNode.leftNode = new BinaryTreeNode(4);
		root.leftNode.rightNode = new BinaryTreeNode(5);

		root.rightNode.leftNode = new BinaryTreeNode(6);
		root.rightNode.rightNode = new BinaryTreeNode(7);
	}

	public void constructBinarySearchTree(BinaryTreeNode root) {

		// root
		if (root == null) {
			root = new BinaryTreeNode(10);
		}
		// First Child
		root.leftNode = new BinaryTreeNode(7);
		root.rightNode = new BinaryTreeNode(14);

		// Second Child
		root.leftNode.leftNode = new BinaryTreeNode(5);
		root.leftNode.rightNode = new BinaryTreeNode(8);

		root.rightNode.leftNode = new BinaryTreeNode(13);
		root.rightNode.rightNode = new BinaryTreeNode(16);

	}

	public void preOrderTraversal(BinaryTreeNode root) {
		if (root != null) {
			System.out.print(" " + root.data);
			preOrderTraversal(root.leftNode);
			preOrderTraversal(root.rightNode);
		}

	}

	public void postOrderTraversal(BinaryTreeNode root) {

		if (root != null) {
			postOrderTraversal(root.leftNode);
			postOrderTraversal(root.rightNode);
			System.out.print(" " + root.data);
		}
	}

	public void inOrderTraversal(BinaryTreeNode root) {
		if (root != null) {
			inOrderTraversal(root.leftNode);
			System.out.print(" " + root.data);
			inOrderTraversal(root.rightNode);
		}
	}

	public void breadthFirstSearch(BinaryTreeNode root) {
		Queue<BinaryTreeNode> queue = new LinkedList<>();
		if (root == null) {
			return;
		}

		queue.add(root);

		while (!queue.isEmpty()) {
			BinaryTreeNode node = queue.remove();
			System.out.print("  " + node.data);
			if (node.leftNode != null) {
				queue.add(node.leftNode);
			}

			if (node.rightNode != null) {
				queue.add(node.rightNode);
			}
		}
	}

	public void deapthFirstSearch(BinaryTreeNode root) {
		Stack<BinaryTreeNode> stack = new Stack<>();
		if (root == null) {
			return;
		}

		stack.add(root);

		while (!stack.isEmpty()) {
			BinaryTreeNode node = stack.pop();
			System.out.print("  " + node.data);

			if (node.rightNode != null) {
				stack.push(node.rightNode);
			}
			if (node.leftNode != null) {
				stack.push(node.leftNode);
			}
		}
	}

	public BinaryTreeNode cloneTree(BinaryTreeNode node) {
		if (node == null) {
			return null;
		}
		BinaryTreeNode newNode = new BinaryTreeNode(node.data);
		newNode.leftNode = cloneTree(node.leftNode);
		newNode.rightNode = cloneTree(node.rightNode);
		return newNode;
	}

	public void levelOrderTraversal(BinaryTreeNode node, HashMap<Integer, List<BinaryTreeNode>> levelOrderMap) {
		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.add(node);
		int level = 1;

		while (!queue.isEmpty()) {			
			BinaryTreeNode qNode = queue.remove();
			if (levelOrderMap.get(level) != null) {
				List<BinaryTreeNode> list = levelOrderMap.get(level);
				list.add(qNode);
				levelOrderMap.put(level, list);
			} else {
				List<BinaryTreeNode> list = new ArrayList<BinaryTreeNode>();
				list.add(qNode);
				levelOrderMap.put(level, list);
			}

			if (queue.isEmpty()) {				
				List<BinaryTreeNode> list = levelOrderMap.get(level);
				level = level+1;
				for (BinaryTreeNode bnode : list) {
					if (bnode.leftNode != null) {
						queue.add(bnode.leftNode);
					}
					if (bnode.rightNode != null) {
						queue.add(bnode.rightNode);
					}
				}

			}

		}

	}

}
