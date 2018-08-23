
public class DiagonalMatrix {

	public DiagonalMatrix() {
		// TODO Auto-generated constructor stub
	}

	private static void printMatrix(int[][] mat) {
		// System.out.println(mat[0].length);
		// System.out.println(mat.length);
		for (int i = 0; i < mat.length - 1; i++) {
			for (int j = 0; j < mat[0].length - 1; j++) {
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}
	}

	/*
	 * 
	 * 1 2 3 5 6 7 9 10 11 13 14 15
	 * 
	 */
	private static void diagonalOrder(int[][] mat) {

		// 00
		// 10 01
		// 20 11 02
		// 30 22 13
		// 41 32
		// 44

		int ROW = mat[0].length;
		int COL = mat.length;
		
		for (int line = 1; line <= (ROW + COL - 1); line++) {
			 
			int start_col = Math.max(0, line - ROW);
			int count = Math.min(line, (COL - start_col), ROW);
			for (int j = 0; j < count; j++)
	        System.out.print(mat[Math.min(ROW, line) - j - 1]
	                            [start_col + j] + " ");

			

		}

	}

	public static void main(String[] args) {
		int M[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 }, };
		System.out.print("Given matrix is \n");
		printMatrix(M);

		System.out.print("\nDiagonal printing of matrix is \n");
		diagonalOrder(M);
	}
}
