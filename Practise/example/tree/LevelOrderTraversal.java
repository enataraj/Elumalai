package example.tree;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

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

public class LevelOrderTraversal {
	public static void main(String[] args) {
		TreeUtil util = new TreeUtil();
		System.out.println("-------------------------------------------------");
		BinaryTreeNode root = new BinaryTreeNode(10);
		util.constructBinarySearchTree(root);
		HashMap<Integer, List<BinaryTreeNode>> levelOrderMap = new HashMap<>();
		util.levelOrderTraversal(root, levelOrderMap);
		
		Set<Integer> keySet = levelOrderMap.keySet();
		for(Integer key :keySet){
			System.out.print("Level : "+key+"   ");
			List<BinaryTreeNode> list = levelOrderMap.get(key);
			for(BinaryTreeNode node :list){
				System.out.print("   "+node.data);
			}
			System.out.println("\n");
			
		}
		System.out.println(levelOrderMap);

	}
	

}
