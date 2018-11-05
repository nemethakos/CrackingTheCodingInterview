package Chapter_05_Bit_Manipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import Chapter_05_Bit_Manipulation.Insertion;

class InsertionTest {

	@Test
	void testInsert() {
		/**
		 * <p>
		 * Input: N = 10000000000, M = 10011, i = 2, j = 6
		 * <p>
		 * Output: N = 10001001100
		 */
		var result = Insertion.insert(0b10011, 0b100_0000_0000, 6, 2);
		assertEquals("10001001100", Integer.toBinaryString(result));
	}

	@Test
	void testGetMask() {
		var mask = Insertion.getMask(15, 8);
		assertEquals("1111111100000000", Integer.toBinaryString(mask));
	}

}
