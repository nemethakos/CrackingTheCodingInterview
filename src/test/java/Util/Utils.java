package Util;

public class Utils {

	/**
	 * Returns true, if the two matrix equals. Does not check dimensions.
	 * 
	 * @param matrix1 the first matrix
	 * @param matrix2 the second matrix
	 * @return true, if the values in the first matrix equals to the second matrix
	 *         values.
	 */
	public static boolean equalMatrix(int[][] matrix1, int[][] matrix2) {

		int rowNum = matrix1.length;
		int colNum = matrix1[0].length;

		for (int row = 0; row < rowNum; row++) {
			for (int col = 0; col < colNum; col++) {
				if (matrix1[row][col] != matrix2[row][col]) {
					return false;
				}
			}
		}

		return true;
	}

}
