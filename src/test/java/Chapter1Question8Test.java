import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Chapter1Question8Test {

	@Test
	void testZeroMatrix() {

		int[][] matrix = { //
				{ 0, 1, 0 }, //
				{ 1, 1, 1 }, //
				{ 0, 1, 0 } //
		};

		int[][] result = { //
				{ 0, 0, 0 }, //
				{ 0, 1, 0 }, //
				{ 0, 0, 0 } //
		};

		assertTrue(equalMatrix(Chapter1Question8.zeroMatrix(matrix), result));
	}

	private boolean equalMatrix(int[][] matrix1, int[][] matrix2) {

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
