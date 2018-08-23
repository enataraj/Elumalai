package tobesolved;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Nishanth");
		queue.add("Elumalai");

		System.out.println(queue); // Keeps the data as Sorted. While poll it
									// retrives based on Sorted first. Not the
									// first In and First Out.
		System.out.println(queue.poll());

		PriorityQueue<Interval> pq = new PriorityQueue<>(new Comparator<Interval>() {
			@Override
			public int compare(Interval i1, Interval i2) {
				/*
				 * if (i1.low > i2.low) return 1; else if (i1.low == i2.low)
				 * return 0; return -1;
				 */

				return i1.low - i2.low;
			};
		});

		pq.add(new Interval(3, 6));
		pq.add(new Interval(4, 10));
		pq.add(new Interval(40, 6));
		pq.add(new Interval(5, 61));
		while (!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
		// System.out.println(pq);

	}
}

class Interval {
	int low;
	int high;

	public Interval(int low, int high) {
		this.low = low;
		this.high = high;
	}

	@Override
	public String toString() {
		return "( " + low + " , " + high + ")";
	}

}
