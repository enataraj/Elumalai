package tree;

public class ValidBST {

	public ValidBST() {
		// TODO Auto-generated constructor stub
	}

	private static void preOrder(Node root) {
		if (root == null) {
			return;
		}

		preOrder(root.left);
		System.out.print(root.data + " ");
		preOrder(root.right);
	}

	private static boolean isValidBST(Node root) {
		return isBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	public static boolean isBSTHelper(Node root, long min, long max) {
		if (root == null)
			return true;

		if (root.data < max && root.data > min) {
			if (isBSTHelper(root.left, min, root.data)) {
				if (isBSTHelper(root.right, root.data, max)) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		return false;
	}
	
	private static boolean isValidBST(Node root,long min, long max){
		if(root==null){
			return true;
		}
		
		return (root.data < max && root.data > min && isValidBST(root.left,min,root.data) && isValidBST(root.right,root.data,max));
	}
	
	private static boolean isValidSingleLine(Node root){
		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	public static void main(String[] args) {
		BinaryTree tree = BinaryTree.getInstance();
		Node root = tree.constructBSTree();
		preOrder(root);
		System.out.println();
		if (isValidBST(root)) {
			System.out.println("Valid BST ... ");
		} else {
			System.out.println("Not. It's not valid BST");
		}

		if (isValidSingleLine(root)) {
			System.out.println("Valid BST ... ");
		} else {
			System.out.println("Not. It's not valid BST");
		}

	}

}
