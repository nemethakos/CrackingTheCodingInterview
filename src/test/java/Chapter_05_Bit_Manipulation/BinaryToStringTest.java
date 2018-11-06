package Chapter_05_Bit_Manipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryToStringTest {

	@Test
	void testBinaryToString() {
		double number = 1.0 / 2 + 1.0 / 4 + 1.0 / 8 + 1.0 / 16; // 0.1111b
		assertEquals("0.1111b", BinaryToString.binaryToString(number));
	}

	@Test
	void testBinaryToString2() {
		double number = 0.0 / 2 + 1.0 / 4 + 0.0 / 8 + 1.0 / 16; // 0.0101b
		assertEquals("0.0101b", BinaryToString.binaryToString2(number));
	}

}
