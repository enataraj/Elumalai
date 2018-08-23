import java.util.LinkedList;

public class BasicLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Elumalai");		
		//list.add(2,"Nishanth"); // Index Out Of Bound Exception
		list.add(1,"Nishanth");
		list.set(1, "Nishanth"); // Overwrite the existing value
		list.remove("ss"); // Not matches wont remove anything
		//list.remove(10); // Index Outof Bound Exception since this index doesnt exist
		// remove
		// remove(index)
		// removeFirst // List is empty throws NosuchException
		// removeLast
		// addFirst
		// addLast
		// add and offer // add is failed it throw exception , offer will give false. sucess add both give true.
		
		System.out.println(list);
		
	}

}
