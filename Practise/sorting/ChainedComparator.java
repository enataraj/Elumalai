package sorting;

import java.util.Comparator;

public class ChainedComparator implements Comparator<Employee1> {

	public ChainedComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		int value = o1.dept.compareTo(o2.dept);
		if (value == 0) {
			return o1.name.compareTo(o2.name);
		}
		return value;
	}

}
