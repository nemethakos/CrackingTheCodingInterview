package Chapter1_Arrays_And_Strings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import Chapter1_Arrays_And_Strings.Chapter1Question7;
import util.Utils;

class Chapter1Question7Test {

	@Test
	void testRotateMatrix() {
		int[][] matrix = { //
				{ 1, 2, 3 }, //
				{ 8, 9, 4 }, //
				{ 7, 6, 5 } //
		};

		int[][] rotated = { //
				{ 7, 8, 1 }, //
				{ 6, 9, 2 }, //
				{ 5, 4, 3 } //
		};

		assertTrue(Utils.equalMatrix(Chapter1Question7.rotateMatrix(matrix), rotated));

		assertFalse(Utils.equalMatrix(Chapter1Question7.rotateMatrix(rotated), matrix));
	}

}
