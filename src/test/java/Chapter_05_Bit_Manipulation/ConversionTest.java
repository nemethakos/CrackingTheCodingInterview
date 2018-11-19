package Chapter_05_Bit_Manipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {

	@Test
	void testConversion() {
		assertEquals(4, Conversion.conversion(0b0_1111_1111, 0b0_1111_0000));
	}

	@Test
	void testConversion2() {
		assertEquals(4, Conversion.conversion2(0b0_1111_1111, 0b0_1111_0000));
	}

}
