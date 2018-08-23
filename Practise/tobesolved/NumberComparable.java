package tobesolved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberComparable {
	public static void main(String[] args) {
		List<Number> list = new ArrayList<>();

		list.add(new Number(10));
		list.add(new Number(2));
		list.add(new Number(30));
		list.add(new Number(140));
		Collections.sort(list);
		System.out.println("Result : " + list);

		List<Num> numList = new ArrayList<>();
		numList.add(new Num(10));
		numList.add(new Num(2));
		numList.add(new Num(30));
		numList.add(new Num(140));
		Collections.sort(numList, new NumberComparator());
		System.out.println("Result Comparator : " + numList);

	}

}
