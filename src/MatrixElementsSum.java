
public class MatrixElementsSum {
	static int matrixElementsSum(int[][] matrix) {
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					for (int k = i; k < matrix.length; k++) {
						matrix[k][j] = 0;
					}
					continue;
				} else
					count += matrix[i][j];
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 1, 2 }, { 0, 5, 0, 0 }, { 2, 0, 3, 3 } };

		System.out.print(matrixElementsSum(matrix));

	}

}
