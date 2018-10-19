package Chapter1_Arrays_And_Strings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import Chapter1_Arrays_And_Strings.Chapter1Question8;
import util.Utils;

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
