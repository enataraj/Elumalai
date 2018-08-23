package tree;

import java.util.HashMap;
import java.util.LinkedList;

public class PrintNodeInEachLevel {

	public PrintNodeInEachLevel() {
		// TODO Auto-generated constructor stub
	}

	private static void printNodesInEachLevel(Node root) {
		if (root == null) {
			return;
		}

		HashMap<Integer, LinkedList<Node>> levelMap = new HashMap<>();
		LinkedList<Node> list = new LinkedList<>();
		int level = 0;
		list.add(root);
		levelMap.put(level, list);
		do {
			LinkedList<Node> nodeList = levelMap.get(level);
			level++;
			list = new LinkedList<>();
			for (Node node : nodeList) {
				if (node.left != null) {
					list.add(node.left);
				}
				if (node.right != null) {
					list.add(node.right);
				}
			}

			if (!list.isEmpty()) {
				levelMap.put(level, list);
			}

		} while (!list.isEmpty());
		
		System.out.println(levelMap);
	}
	
	public static void main(String[] args) {
        BinaryTree tree = BinaryTree.getInstance();
        Node root = tree.constructTree1();
        printNodesInEachLevel(root);
	}

}
