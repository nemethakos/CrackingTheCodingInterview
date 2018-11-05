package Chapter_01_Arrays_And_Strings;
import java.util.Arrays;
import java.util.HashSet;

public class Chapter1Question1 {

	/**
	 * Implement an algorithm to determine if a string has all unique characters.
	 * What if you cannot use additional data structures?
	 * 
	 * @param text the String to check
	 * @return true if unique, false otherwise
	 */
	public static boolean isUniqueWithBruteForce(String text) {
		for (int index1 = 0; index1 < text.length(); index1++) {
			for (int index2 = index1 + 1; index2 < text.length(); index2++) {
				if (text.charAt(index1) == text.charAt(index2)) {
					return false;
				}
			}

		}
		return true;

	}

	/**
	 * Implement an algorithm to determine if a string has all unique characters.
	 * What if you cannot use additional data structures?
	 * 
	 * @param text the String to check
	 * @return true if unique, false otherwise
	 */
	public static boolean isUniqueWithHashMap(String text) {
		HashSet<Character> chars = new HashSet<Character>();
		for (var character : text.toCharArray()) {
			if (!chars.add(character)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Implement an algorithm to determine if a string has all unique characters.
	 * What if you cannot use additional data structures?
	 * 
	 * @param text the String to check
	 * @return true if unique, false otherwise
	 */
	public static boolean isUniqueWithSorting(String text) {

		if (text.length() < 2) {
			return true;
		}

		var array = text.toCharArray();
		Arrays.sort(array);

		for (int i = 1; i < text.length(); i++) {
			if (array[i - 1] == array[i]) {
				return false;
			}
		}

		return true;

	}

	/**
	 * Implement an algorithm to determine if a string has all unique characters.
	 * What if you cannot use additional data structures?
	 * 
	 * @param text the String to check
	 * @return true if unique, false otherwise
	 */
	public static boolean isUniqueWithBitmap(String text) {
		int length = (int) (Math.pow(2, 16) / 8);
		byte[] bitmap = new byte[length];
		for (var c : text.toCharArray()) {
			int index = (int) c;
			int byteIndex = index / 8;
			int bitIndex = 1 << (index & 7);

			boolean found = (bitmap[byteIndex] & bitIndex) > 0;
			if (!found) {
				bitmap[byteIndex] |= bitIndex;
			} else {
				return false;
			}
		}
		return true;
	}

}
