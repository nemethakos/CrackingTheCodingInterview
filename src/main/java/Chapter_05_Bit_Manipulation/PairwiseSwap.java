package Chapter_05_Bit_Manipulation;

/**
 * <b>Pairwise Swap:</b> Write a program to swap odd and even bits in an integer
 * with as few instructions as possible (e.g., bit 0 and bit 1 are swapped, bit
 * 2 and bit 3 are swapped, and so on).
 */
public class PairwiseSwap {

	public static int swap(int number) {
		return (number & 0b0_0101_0101_0101_0101_0101_0101_0101_0101) << 1 | 
			   (number & 0b0_1010_1010_1010_1010_1010_1010_1010_1010) >>> 1;
		
	}

}
