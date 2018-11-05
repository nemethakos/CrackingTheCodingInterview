package Chapter_01_Arrays_And_Strings;

public class Chapter1Question8 {

	/**
	 * Write an algorithm such that if an element in an MxN matrix is 0, its entire
	 * row and column are set to 0
	 * <p>
	 * <em>Note:</em>This solution has a space complexity of O(M+N) where a O(1)
	 * space complexity solution exists: use the first row for storing the columns
	 * to null and the first column for the rows to null.
	 * 
	 * @param matrix the matrix (the matrix is changed during execution)
	 * @return the modified matrix
	 */
	public static int[][] zeroMatrix(int[][] matrix) {
		int rowNum = matrix.length;
		int colNum = matrix[0].length;

		boolean[] cols = new boolean[colNum];
		boolean[] rows = new boolean[rowNum];

		for (int row = 0; row < rowNum; row++) {
			for (int col = 0; col < colNum; col++) {
				if (matrix[row][col] == 0) {
					rows[row] = true;
					cols[col] = true;
				}
			}
		}

		for (int row = 0; row < rowNum; row++) {
			for (int col = 0; col < colNum; col++) {
				if (rows[row] || cols[col]) {
					matrix[row][col] = 0;
				}
			}
		}
		return matrix;
	}

}
