package Chapter_05_Bit_Manipulation;

/**
 * <b>Flip Bit to Win:</b> You have an integer and you can flip exactly one bit
 * from a 0 to a 1. Write code to find the length of the longest sequence of ls
 * you could create.
 * <p>
 * EXAMPLE
 * <p>
 * Input: 1775 (or: 11011101111)
 * <p>
 * Output: 8
 */
public class FlipBitToWin {

	/**
	 * Official implementation
	 * 
	 * @param number the number to analyze
	 * @return the longest sequence
	 */
	public static int flipBit(int number) {
		// if number's bits are all 1s, return 32
		if (~number == 0) {
			return Integer.BYTES * 8;
		}

		var currentLength = 0;
		var previousLength = 0;
		// if all bits are 0, the flipped bit causes the longest sequence to be of
		// length 1
		var maxLength = 1;

		while (number != 0) {

			// lsb is 1
			if ((number & 1) == 1) {
				currentLength++;
			}
			// lsb is 0
			else if ((number & 1) == 0) {
				// if the next bit is zero (we can't join the two bit sequence)
				if ((number & 2) == 0) {
					previousLength = 0;
				}
				// if the next bit is 1 (we can join the two bit sequence)
				else {
					previousLength = currentLength;
				}
				currentLength = 0;
			}
			maxLength = Math.max(previousLength + 1 + currentLength, maxLength);
			number >>>= 1;
		}
		return maxLength;
	}

	private static int currentBit(int number) {
		return (number & 0b0_1);
	}

	private static int nextBit(int number) {
		return (number & 0b0_10);
	}

	public static int longestSequenceOfOnesCanBeCreated(int number) {

		// we must check if all bits are 1, since the algorithm would return 33, which
		// is incorrect
		if (~number == 0) {
			return 32;
		}

		// longest sequence of ones
		var longestSequence = 1;

		// count of ones
		var currentOnes = 0;

		var previousOnes = 0;

		System.out.println("\r\nnumber: " + Integer.toBinaryString(number) + "\r\n");

		while (number != 0) {

			// current bit is 1
			if (currentBit(number) == 1) {
				currentOnes++;
			}
			// current bit is 0
			else {
				// next bit is 0
				if (nextBit(number) == 0) {
					previousOnes = 0;

					// next bit is 1
				} else {
					previousOnes = currentOnes;
				}
				currentOnes = 0;
			}
			longestSequence = Math.max(longestSequence, currentOnes + 1 + previousOnes);
			number = number >>> 1;
		}

		System.out.println("Longest sequence: " + longestSequence);
		return longestSequence;
	}

}
