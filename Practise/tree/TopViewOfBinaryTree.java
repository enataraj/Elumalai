package tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class TopViewOfBinaryTree {

	public TopViewOfBinaryTree() {
		// TODO Auto-generated constructor stub
	}

	private static void printTopView(Node root) {
		/*
		 * Do Level Order Traversal While go Left separate -1 from root HD. add
		 * into Queue While go right add+1 to root add into Queue
		 * 
		 */
		if (root == null) {
			return;
		}

		Queue<TreeNode> q = new LinkedList<>();
		q.add(new TreeNode(root, 0));
		HashSet<Integer> set = new HashSet<>();

		while (!q.isEmpty()) {
			TreeNode tNode = q.remove();
			Node node = tNode.node;
			int hd = tNode.hd;

			// Check in the Set contains the HD already if not then that node is
			// visible.
			if (!set.contains(hd)) {
				set.add(hd);
				System.out.print("  " + node.data);
			}

			// If Left node is not null add the left node to Queue and Separate
			// hd from parent node.
			if (node.left != null) {
				TreeNode nTNode = new TreeNode(node.left, hd - 1);
				q.add(nTNode);
			}

			// if the Right node is not null add the right node to Queue and add
			// 1 to the parant hd.
			if (node.right != null) {
				TreeNode nTNode = new TreeNode(node.right, hd + 1);
				q.add(nTNode);
			}

		}

	}

	private static void printTopViewWithoutNewClass(Node root) {
		if (root == null) {
			return;
		}

		Map<Integer, LinkedList<Node>> hashMap = new TreeMap<>();
		int hd = Integer.MIN_VALUE;
		Queue<Node> q = new LinkedList<>();

		q.add(root);
		while (!q.isEmpty()) {
			Node node = q.remove();
			if (hashMap.isEmpty()) {
				LinkedList<Node> list = new LinkedList<>();
				list.add(node);
				hd = 0;
				hashMap.put(hd, list);
			} else {
				Set<Integer> keySet = hashMap.keySet();
				Iterator<Integer> itr = keySet.iterator();
				while (itr.hasNext()) {
					int key = itr.next();
					LinkedList<Node> list = hashMap.get(key);
					if (list.contains(node)) {
						hd = key;
						break;
					}
				}
			}
			if (node.left != null) {
				int h = hd - 1;
				if (hashMap.get(h) == null) {
					LinkedList<Node> list = new LinkedList<>();
					list.add(node.left);
					hashMap.put(h, list);
				} else {
					LinkedList<Node> list = hashMap.get(h);
					list.add(node.left);

				}
				q.add(node.left);
			}

			if (node.right != null) {
				int h = hd + 1;
				if (hashMap.get(h) == null) {
					LinkedList<Node> list = new LinkedList<>();
					list.add(node.right);
					hashMap.put(h, list);
				} else {
					LinkedList<Node> list = hashMap.get(h);
					list.add(node.right);
				}
				q.add(node.right);

			}
		}

		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> itr = keySet.iterator();
		while (itr.hasNext()) {
			int key = itr.next();
			LinkedList<Node> list = hashMap.get(key);
			System.out.print(list.get(0) + " ");
		}

	}

	private static void topViewHR(Node root) {
		if (root == null) {
			return;
		}
		if(root.left!=null){
			travLeft(root.left);
			System.out.print(" "+root.data);
			
		}
		if(root.right!=null){
			travRight(root.right);
		}
			
	}

	private static void travRight(Node node) {
		if (node.right != null) {
			travRight(node.right);
			System.out.print(" " + node.data);
		}
	}

	private static void travLeft(Node node) {
		if (node.left != null) {
			travLeft(node.left);
			System.out.print(" " + node.data);
		}
	}

	public static void main(String[] args) {
		BinaryTree tree = BinaryTree.getInstance();
		Node root = tree.constructBSTree();
		printTopView(root);
		System.out.println();
		printTopViewWithoutNewClass(root);
		System.out.println();
		topViewHR(root);

	}

}

class TreeNode {
	Node node;
	int hd;

	public TreeNode(Node node, int hd) {
		this.node = node;
		this.hd = hd;
	}
}
