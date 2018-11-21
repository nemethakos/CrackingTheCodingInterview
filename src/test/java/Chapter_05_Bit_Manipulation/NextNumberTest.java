package Chapter_05_Bit_Manipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextNumberTest {

	public static void print(String label, int input, int output) {
		System.out.println("\r\n"+label + "\t" + Integer.toBinaryString(input) + "(" + input + ")\r\n\t\t\t\t"
				+ Integer.toBinaryString(output) + "(" + output + ")");
	}

	@Test
	void testGetNextArithmetic() {
		int input = 0b0111000111000;
		print("next:\t\t\t", input, NextNumber.getNext(input));
	}

	@Test
	void testGetPrevArithmetic() {
		int input = 0b111000111000111;
		print("prev:\t\t\t", input, NextNumber.getPrev(input));
	}

	@Test
	void testGetNext() {
		int input = 0b111000111000;
		print("next arithmetic:\t", input, NextNumber.getNextArithmetic(input));
	}

	@Test
	void testGetPrev() {
		int input = 0b111000111000111;
		print("prev arithmetic:\t", input, NextNumber.getPrevArithmetic(input));
	}

}
