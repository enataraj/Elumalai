package tobesolved;

public class Number implements Comparable<Number> {

	private int a;

	public Number(int a) {
		this.a = a;
	}

	@Override
	public int compareTo(Number num) {
		if (this.a > num.a) {
			return 1;
		} else if (this.a == num.a) {
			return 0;
		} else {
			return -1;
		}

	}

	@Override
	public String toString() {

		return "" + this.a;
	}

}
