package Chapter_05_Bit_Manipulation;

/**
 * <b>Insertion:</b> You are given two 32-bit numbers, N and M, and two bit
 * positions, i and j. Write a method to insert M into N such that M starts at
 * bit j and ends at bit i. You can assume that the bits j through i have enough
 * space to fit all of M. That is, if M = 10011, you can assume that there are
 * at least 5 bits between j and i. You would not, for example, have j = 3 and i
 * = 2, because M could not fully fit between bit 3 and bit 2.
 * <p>
 * <p>
 * EXAMPLE
 * <p>
 * Input: N = 10000000000, M = 10011, i = 2, j = 6
 * <p>
 * Output: N = 10001001100
 */
public class Insertion {

	/**
	 * Inserts the number toBeInserted into number insertTo from insertPositionStart
	 * to insertPositionEnd and returns the resulting number.
	 * 
	 * @param toBeInserted        the number to be inserted
	 * @param insertTo            the number inserted into
	 * @param insertPositionStart the start bit index of insertion, greater than
	 *                            insertPositionEnd
	 * @param insertPositionEnd   the end bit index of insertion, less than
	 *                            insertPositionStart
	 * @return the resulting number.
	 */
	public static int insert(int toBeInserted, int insertTo, int insertPositionStart, int insertPositionEnd) {
		int mask = getMask(insertPositionStart, insertPositionEnd);
		int masked = insertTo & ~mask;
		int shifted = toBeInserted << insertPositionEnd;
		int result = masked | shifted;
		return result;
	}

	/**
	 * Returns a number where the bits from start to end are 1-s. start >= end
	 * 
	 * @param start the start index of the bits with 1-s
	 * @param end   the end index of the bits with 0-s
	 * @return the generated number
	 */
	public static int getMask(int start, int end) {

		int numBits = start - end + 1;
		// create a mask with full 1-s
		int mask = 0;
		for (int i = 0; i < numBits; i++) {
			mask = mask << 1 | 1;
		}
		// shift the mask to the left to add the necessary 0-s at the end
		mask = mask << end;

		return mask;
	}
}
