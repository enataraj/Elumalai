package tree;

public class PrintPathOfTree {

	public PrintPathOfTree() {
		// TODO Auto-generated constructor stub
	}
	
	public static void printPath(Node node,String path){
		if(node ==null){
			
			return;
		}
		
		if(path==""){
		path = path+node.data;
		}else{
			path=path+"-->"+node.data;
		}
		
		if(node.left==null && node.right==null){
			System.out.println("Path : "+path);
		}
		
		printPath(node.left,path);
		printPath(node.right,path);
	}
	
	public static void main(String[] args) {
		BinaryTree tree = BinaryTree.getInstance();
		Node root = tree.constructTree4();
		printPath(root,"");
	}

}
