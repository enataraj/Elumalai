import java.util.Iterator;
import java.util.TreeSet;

public class SimpleTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> tt = new TreeSet<>();
		tt.add(40);
		tt.add(3);
		tt.add(43);
		tt.add(432);
		tt.add(436);
		
		System.out.println(tt);
		
		System.out.println("Higher : "+tt.higher(43));
		System.out.println("Lower :"+tt.lower(43));
		
		Iterator itr = tt.iterator();
		while(itr.hasNext()){
			System.out.println(" Values :"+itr.next());
		}
		
		System.out.println("First :"+tt.first());
		System.out.println("Celling :"+tt.ceiling(41));
		System.out.println("Fllor :"+tt.floor(41));
		System.out.println("Last :"+tt.last());
		System.out.println("Poll First :"+tt.pollFirst());
		System.out.println("Poll First :"+tt.pollFirst());
		System.out.println("Size "+tt.size());
		System.out.println("Poll Last :"+tt.pollLast());
		
		
		
	}

}
