import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberComparableMain {

	public static void main(String[] args) {
		List<StringComparable> list = new ArrayList<>();
		StringComparable obj1 = new StringComparable("10");
		list.add(obj1);
		StringComparable obj2 = new StringComparable("2");
		list.add(obj2);
		StringComparable obj3 = new StringComparable();
		list.add(obj3);
		StringComparable obj4 = new StringComparable("6");
		list.add(obj4);
		StringComparable obj5 = new StringComparable("1");
		list.add(obj5);
		
		System.out.println(list);
		
		Collections.sort(list);

		System.out.println(list);
	}
}
