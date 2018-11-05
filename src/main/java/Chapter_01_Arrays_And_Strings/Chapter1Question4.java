package Chapter_01_Arrays_And_Strings;
import java.util.HashMap;
import java.util.Objects;

public class Chapter1Question4 {

	/**
	 * <p>
	 * Given a string, write a function to check if it is a permutation of a
	 * palindrome. A palindrome is a word or phrase that is the same forwards and
	 * backwards. A permutation is a rearrangement of letters. The palindrome does
	 * not need to be limited to just dictionary words.
	 * <p>
	 * <em>Assumptions:</em>
	 * <ul>
	 * <li>ASCII characters are used (a-z)
	 * <li>White space does not count when checking the palindrome
	 * </ul>
	 * <p>
	 * EXAMPLE Input: Tact Coa
	 * <p>
	 * Output: True (permutations: "taco cat", "atco eta", etc.)
	 *
	 * @param text the text to be checked
	 * @return true, if the text could be rearranged to be a palindrome
	 */
	public static boolean isPalindromePermutationASCII(String text) {
		Objects.requireNonNull(text);
		if (text.length() == 0) {
			return true;
		}

		int bits = 0;
		for (var c : text.toLowerCase().toCharArray()) {
			if (!Character.isWhitespace(c)) {
				// index will be between 0(a) and 26(z)
				int index = (c - 'a');
				// the indexth bit will be set to 1
				int mask = 1 << index;
				// flip the indexth bit
				bits ^= mask;
			}
		}

		// true when all characters occures even times (all bits are zero)
		boolean allCharsOccursEvenTimes = bits == 0;
		// true when only one bit set to 1
		boolean onlyOneBitSetTo1 = ((bits - 1) & bits) == 0;

		return allCharsOccursEvenTimes || onlyOneBitSetTo1;
	}

	/**
	 * <p>
	 * Given a string, write a function to check if it is a permutation of a
	 * palindrome. A palindrome is a word or phrase that is the same forwards and
	 * backwards. A permutation is a rearrangement of letters. The palindrome does
	 * not need to be limited to just dictionary words.
	 * <p>
	 * <em>Assumptions:</em>
	 * <ul>
	 * <li>Unicode characters are used
	 * <li>White space does not count when checking the palindrome
	 * </ul>
	 * <p>
	 * EXAMPLE Input: Tact Coa
	 * <p>
	 * Output: True (permutations: "taco cat", "atco eta", etc.)
	 *
	 * @param text the text to be checked
	 * @return true, if the text could be rearranged to be a palindrome
	 */
	public static boolean isPalindromePermutation(String text) {
		Objects.requireNonNull(text);
		if (text.length() == 0) {
			return true;
		}
		var map = new HashMap<Character, Integer>();
		for (var c : text.toLowerCase().toCharArray()) {
			if (!Character.isWhitespace(c)) {
				if (map.get(c) == null) {
					map.put(c, 0);
				}
				map.put(c, map.get(c) + 1);
			}
		}

		int oddCount = 0;
		for (var c : map.keySet().toArray(new Character[0])) {
			if ((map.get(c) & 1) == 1) {
				oddCount++;
			}
		}

		return oddCount <= 1;
	}

}
