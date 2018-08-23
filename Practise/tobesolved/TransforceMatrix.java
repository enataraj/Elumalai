package tobesolved;

public class TransforceMatrix {

	public void printArray(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}

	}

	public int[][] transMat(int a[][]) {
		int col = a[0].length;
		int row = a.length;
		int[][] result = new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				result[j][i] = a[i][j];
			}

		}
		return result;
	}

	public int[][] transMatInPlace(int a[][]) {
		int col = a[0].length;
		int row = a.length;
		for (int i = 0; i < row; i++) {
			for (int j = i; j < col; j++) {
				if (i != j) {
					int temp = a[j][i];
					a[j][i] = a[i][j];
					a[i][j] = temp;
				}
			}

		}
		return a;
	}

	public static void main(String[] args) {
		int a[][] = new int[][] { { 2, 3, 6 }, { 4, 5, 10 }, { 20, 30, 40 } };
		TransforceMatrix mat = new TransforceMatrix();
		mat.printArray(a);
		System.out.println("Transfored matrix ");
		mat.printArray(mat.transMat(a));
		mat.transMatInPlace(a);
	}
}
