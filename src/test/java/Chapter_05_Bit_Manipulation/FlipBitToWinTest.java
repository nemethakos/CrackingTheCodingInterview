package Chapter_05_Bit_Manipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlipBitToWinTest {

	@Test
	void testLongestSequenceOfOnesCanBeCreated() {
		FlipBitToWin.longestSequenceOfOnesCanBeCreated(0b10101);
		
		FlipBitToWin.longestSequenceOfOnesCanBeCreated(0b1111_1111_1111_1111_1111_1111_1111_1111);
	}

}
