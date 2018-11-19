package Chapter_05_Bit_Manipulation;

import org.junit.jupiter.api.Test;

class DebuggerTest {

	@Test
	void testIsPowerOfTwoOrZero() {

		System.out.println("i=0b0_10101010101->" + Debugger.isPowerOfTwoOrZero(0b0_10101010101));
		
		System.out.println("i=0->" + Debugger.isPowerOfTwoOrZero(0));
		var i = 1;
		while (i != 0) {
			System.out.println("i=" + Integer.toBinaryString(i) + "->" + Debugger.isPowerOfTwoOrZero(i));
			i <<= 1;
		}
	}

}
