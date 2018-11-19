package Chapter_05_Bit_Manipulation;

/**
 * <b>Debugger:</b> Explain what the following code does: ( ( n & ( n-1)) == 0).
 */
public class Debugger {

	/**
	 * Return true if the number is a power of two (or zero)
	 * 
	 * @param number the number to check
	 * @return true if the number is a power of two (or zero)
	 */
	public static boolean isPowerOfTwoOrZero(int number) {
		return (number & (number - 1)) == 0;
	}

}
