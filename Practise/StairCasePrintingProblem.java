
public class StairCasePrintingProblem {

	public StairCasePrintingProblem() {
		// TODO Auto-generated constructor stub
	}

	private static void printStairCase(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n - i - 1; k++) {
				System.out.print(" ");
			}
			for (int j = n; j >= n - i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	private static void simpleWaySolve(int n) {
		StringBuilder str = new StringBuilder("#");
		for (int i = 0; i < n; i++) {
			System.out.printf("%" + (n + 1) + "s", str + "\n");
			str.append("#");
		}
	}
	
	private static void anotherWay(int n){
		StringBuilder str = new StringBuilder("#");
		for(int i=0;i<n;i++){
			str.append("#");
		}
		String result = str.toString();
		
		for(int i=0;i<n;i++){
			result.replaceFirst(, replacement)
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		printStairCase(5);
		simpleWaySolve(10);
		anotherWay(4);
	}
}
