import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ListRemoveDuringIteration {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Elumalai");
		map.put(2, "Elumalai");
		map.put(3, "Elumalai");
		map.put(4, "Elumalai");

		boolean flag = true;
		Iterator<Integer> itr1 = map.keySet().iterator();
		while (itr1.hasNext()) {
			Integer key = itr1.next();
		
			if (flag) {
				map.put(5, "change");
				flag = false;
			}
			System.out.println("Key :" + map.get(key));
			

		}

		List<String> list = new ArrayList<>();
		list.add("Elumalai 1");
		list.add("Elumalai 2");
		list.add("Elumalai 3");
		list.add("Elumalai 4");
		list.add("Elumalai 5");
		flag = true;
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Print : " + list.get(i));
			System.out.println("Size " + list.size());
			if (flag) {
				list.remove(4);
				flag = false;
			}

		}

		flag = true;
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println("Iter -> " + itr.next());
			if (flag) {
				list.add("asdsa3");
				flag = false;
			}
		}

	}
}
