package Chapter_05_Bit_Manipulation;

/**
 * <p>
 * <b>Conversion:</b> Write a function to determine the number of bits you would
 * need to flip to convert integer A to integer B.
 * <p>
 * EXAMPLE
 * <p>
 * Input: 29 (or: 11101), 15 (or: 01111)
 * <p>
 * Output: 2
 */
public class Conversion {

	/**
	 * Returns the number of bits should be flipped to convert A -> B. Uses
	 * {@link Integer#bitCount(int)}
	 * 
	 * @param a the number A
	 * @param b the number B
	 * @return the number of bits should be flipped to convert A -> B
	 */
	public static int conversion(int a, int b) {
		return Integer.bitCount(a ^ b);
	}

	/**
	 * Returns the number of bits should be flipped to convert A -> B. Uses own
	 * bitcount implementation.
	 * 
	 * @param a the number A
	 * @param b the number B
	 * @return the number of bits should be flipped to convert A -> B
	 */
	public static int conversion2(int a, int b) {
		return bitCount(a ^ b);
	}

	public static int bitCount(int number) {
		int result = 0;
		while (number != 0) {
			// eliminate rightmost 1 bit
			number = number & (number - 1);
			result++;
		}
		return result;
	}

}
