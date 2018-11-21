package Chapter_05_Bit_Manipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairwiseSwapTest {

	@Test
	void testSwap() {
		assertEquals(0x55_55_55_55, PairwiseSwap.swap(0xaa_aa_aa_aa));
	}

}
