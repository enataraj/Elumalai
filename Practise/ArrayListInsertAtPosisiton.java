import java.util.ArrayList;

public class ArrayListInsertAtPosisiton {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1, 101); // Add will just push the data one position next and
							// place the data in specified position
		list.set(2, 20); // Set will replace the element at the position
		System.out.println(list);
	}

}
