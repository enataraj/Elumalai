package example.tree;

public class DeapthFirstSearch {	

	
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
		System.out.println("... Deapth First Search ...");
		BinaryTreeNode root = new BinaryTreeNode(10);
		util.constructBinarySearchTree(root);
		util.deapthFirstSearch(root);
		System.out.println(" \n ***************************************");

	}



}
