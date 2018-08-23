
public enum Season {
	WINTER(1) {
		public void weatherCondition() {
			System.out.println("Cool");
		}
	},
	SUMMER(2) {
		public void weatherCondition() {
			System.out.println("Hot");
		}
	},
	SPRING(3) {
		public void weatherCondition() {
			System.out.println("Hot and Coool");
		}
	},
	FALL(4) {
		public void weatherCondition() {
			System.out.println("Raining");
		}
	};
	int value;

	private Season(int value) {
		this.value = value + 5;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void addNumber() {
		int a = 10, b = 20;
		System.out.println("Sum : " + (a + b));
	}

	public abstract void weatherCondition();

}
