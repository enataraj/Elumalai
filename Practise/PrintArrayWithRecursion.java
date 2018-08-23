
public class PrintArrayWithRecursion {
	private int[] a = { 2, 3, 5, 6, 23, 45, 62, 1, 4 };

	public void printArrayWithRecursion(int index) {
		if (index >= 0 && index < a.length) {
			System.out.print(a[index]+" ");
//			index = index+1;
			printArrayWithRecursion(++index);
		}else{
			System.out.println("Index is out of range");
		}

	}

	public static void main(String[] args) {
		System.out.println("Printing Array");
	
		new PrintArrayWithRecursion().printArrayWithRecursion(0);
	}
}
