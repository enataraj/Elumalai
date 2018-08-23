
public class StringComparable implements Comparable<StringComparable> {

	private String initializationOrder = "0";

	public StringComparable() {

	}

	public StringComparable(String initializationOrder) {
		this.initializationOrder = initializationOrder;
	}

	public String getInitializationOrder() {
		return initializationOrder;
	}

	public void setInitializationOrder(String initializationOrder) {
		this.initializationOrder = initializationOrder;
	}

	@Override
	public int compareTo(StringComparable comp) {
		if (comp.initializationOrder != null && this.initializationOrder != null) {
			if (Integer.parseInt(this.initializationOrder) > Integer.parseInt(comp.initializationOrder)) {
				return 1;
			} else if (Integer.parseInt(this.initializationOrder) < Integer.parseInt(comp.initializationOrder)) {
				return -1;
			}
		} else {
			return 0;
		}
		return 0;
	}

	@Override
	public String toString() {
		return initializationOrder;
	}

}
