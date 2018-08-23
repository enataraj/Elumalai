package tobesolved;

import java.util.Comparator;

public class NumberComparator implements Comparator<Num> {

	@Override
	public int compare(Num o1, Num o2) {
		if (o1.getA() > o2.getA()) {
			return 1;
		} else if (o1.getA() == o2.getA()) {
			return 0;

		} else {
			return -1;
		}
	}

}
