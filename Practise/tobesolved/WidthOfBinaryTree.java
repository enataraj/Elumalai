package tobesolved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class WidthOfBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(null, null, 1);
		root.left = new TreeNode(null, null, 2);
		root.right = new TreeNode(null, null, 3);
		root.left.left = new TreeNode(null, null, 4);
		root.left.right = new TreeNode(null, null, 5);
		root.right.right = new TreeNode(null, null, 8);
		root.right.right.left = new TreeNode(null, null, 6);
		root.right.right.right = new TreeNode(null, null, 7);
		traversal(root);
		System.out.println();
		HashMap<Integer, List<TreeNode>> levelMap = new HashMap<>();
		List<TreeNode> listNode = new ArrayList<>();
		listNode.add(root);
		levelMap.put(1, listNode);
		widthOfEachLevel(levelMap, listNode, 1);
		System.out.println(levelMap);
		for (int i = 1; i <= levelMap.size(); i++) {
			System.out.println("Level : " + i + " No of Node : " + levelMap.get(i).size());
		}
		System.out.println(" In Order Traversal without Recurrsion");
		traversalWithoutRecrussion(root);
	}

	public static void traversal(TreeNode node) {
		if (node == null) {
			return;
		}

		// System.out.println("Data : " + node.data); // PreOrder Traversal
		traversal(node.left);
		System.out.print(" " + node.data); // InOrder Traversal
		traversal(node.right);
		// System.out.println("Data : " + node.data); // PostOrder Traversal

	}

	private static void traversalWithoutRecrussion(TreeNode node) {
		Stack<TreeNode> stack = new Stack<>();

		while (true) {
			while (node != null) {
				System.out.print(" " + node.data); // Pre order Traversal
				stack.push(node);
				node = node.left;
			}

			System.out.println(stack);
			if (stack.isEmpty()) {
				return;
			}

			node = stack.pop();
			System.out.print(" " + node.data); // In order Traversal
			node = node.right;
		}
	}

	private static void widthOfEachLevel(HashMap<Integer, List<TreeNode>> levelMap, List<TreeNode> listNode, int key) {

		List<TreeNode> newListNode = new ArrayList<>();
		for (int i = 0; i < listNode.size(); i++) {
			TreeNode node = listNode.get(i);
			if (node.left != null) {
				newListNode.add(node.left);
			}
			if (node.right != null) {
				newListNode.add(node.right);
			}
		}

		if (newListNode.isEmpty()) {
			return;
		}

		key = key + 1;
		levelMap.put(key, newListNode);
		widthOfEachLevel(levelMap, newListNode, key);
	}

}

class TreeNode {
	TreeNode left;
	TreeNode right;
	int data;

	public TreeNode(TreeNode left, TreeNode right, int data) {
		this.left = left;
		this.right = right;
		this.data = data;
	}

	@Override
	public String toString() {
		return " " + this.data;
	}
}
