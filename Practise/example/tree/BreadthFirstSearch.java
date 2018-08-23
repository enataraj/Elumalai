package example.tree;

public class BreadthFirstSearch {
	
	/** 
	 * 
	 *             10 
	 *             /\
	 *           /	  \
	 *          7 	 	14
	 *         /\		 /\ 
	 *        /  \ 		/  \
	 *     5	  8	 13		16
	 *     
	 *      * @param args
	 */

	public static void main(String[] args) {
		TreeUtil util = new TreeUtil();
		System.out.println("-------------------------------------------------");
		System.out.println("... Breadth First Search ...");
		BinaryTreeNode root3 = new BinaryTreeNode(10);
		util.constructBinarySearchTree(root3);
		util.breadthFirstSearch(root3);
		System.out.println(" \n ***************************************");

	}

}
