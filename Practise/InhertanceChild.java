
public class InhertanceChild extends InheritanceParent{
	
	public  void display(){ // Cant reduce the scope
		System.out.println("child display");
	}

	public static void main(String[] args) {
		InheritanceParent child = new InhertanceChild();
		child.display();
		
		InheritanceParent parent = new InheritanceParent();
		
	}
}


