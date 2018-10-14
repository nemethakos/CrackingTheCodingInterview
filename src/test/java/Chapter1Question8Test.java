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

		assertTrue(Utils.equalMatrix(Chapter1Question8.zeroMatrix(matrix), result));
	}

}
