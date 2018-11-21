package Chapter_05_Bit_Manipulation;

/**
 * <b>Next Number:</b> Given a positive integer, print the next smallest and the
 * next largest number that have the same number of 1 bits in their binary
 * representation.
 */
public class NextNumber {
	public static int getNextArithmetic(int number) {
		int temporaryCounter = number;
		int countZeros = 0;
		int countOnes = 0;

		// 00011000 -> 00011 -> 3 trailing zeros
		// count trailing zeros
		while (((temporaryCounter & 1) == 0) && (temporaryCounter != 0)) {
			countZeros++;
			temporaryCounter >>= 1;
		}

		// 00011 -> 0 -> 2 ones left to trailing zeros
		// count ones left to trailing zeros
		while ((temporaryCounter & 1) == 1) {
			countOnes++;
			temporaryCounter >>= 1;
		}

		// error checking
		// if all the ones are in the left -> no bigger number can be created
		// if the number is zero, no bit can be flipped
		if (countZeros + countOnes == 31 || countZeros + countOnes == 0) {
			return -1;
		}

		return number + (1 << countZeros) + (1 << (countOnes - 1)) - 1;

	}

	public static int getPrevArithmetic(int number) {
		int temporaryCounter = number;
		int countZeros = 0;
		int countOnes = 0;

		// count trailing ones
		while ((temporaryCounter & 1) == 1) {
			countOnes++;
			temporaryCounter >>= 1;
		}
		

		if (temporaryCounter == 0) {
			return -1;
		}

		// count zeros left of trailing ones
		while (((temporaryCounter & 1) == 0) && (temporaryCounter != 0)) {
			countZeros++;
			temporaryCounter >>= 1;
		}

		return number - (1 << countOnes) - (1 << (countZeros - 1)) + 1;
	}

	public static int getNext(int number) {
		int temporaryCounter = number;
		int countZeros = 0;
		int countOnes = 0;

		// 00011000 -> 00011 -> 3 trailing zeros
		// count trailing zeros
		while (((temporaryCounter & 1) == 0) && (temporaryCounter != 0)) {
			countZeros++;
			temporaryCounter >>= 1;
		}

		// 00011 -> 0 -> 2 ones left to trailing zeros
		// count ones left to trailing zeros
		while ((temporaryCounter & 1) == 1) {
			countOnes++;
			temporaryCounter >>= 1;
		}

		// error checking
		// if all the ones are in the left -> no bigger number can be created
		// if the number is zero, no bit can be flipped
		if (countZeros + countOnes == 31 || countZeros + countOnes == 0) {
			return -1;
		}

		int flipPosition = countZeros + countOnes;

		// flip the 0->1
		number |= (1 << flipPosition);
		// clear all the bits right of flipped bit
		number &= ~((1 << flipPosition) - 1);
		// set ones right to the position, but one less
		number |= (1 << (countOnes - 1)) - 1;

		return number;
	}

	public static int getPrev(int number) {
		int temporaryCounter = number;
		int countZeros = 0;
		int countOnes = 0;

		// count trailing ones
		while ((temporaryCounter & 1) == 1) {
			countOnes++;
			temporaryCounter >>= 1;
		}

		if (temporaryCounter == 0) {
			return -1;
		}

		// count zeros left of trailing ones
		while (((temporaryCounter & 1) == 0) && (temporaryCounter != 0)) {
			countZeros++;
			temporaryCounter >>= 1;
		}

		int flipPosition = countZeros + countOnes;

		// flip the 1->0
		number &= ((~0) << (flipPosition + 1));

		
		int mask = (1 << (countOnes + 1)) - 1;

		// set ones right to the position, but one less
		number |= mask << (countZeros - 1);

		return number;
	}

}
