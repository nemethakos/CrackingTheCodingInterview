package Chapter1_Arrays_And_Strings;
import java.util.HashMap;
import java.util.Objects;

import com.google.common.base.Strings;

public class Chapter1Question2 {

	/**
	 * <p>
	 * <em>Question:</em>Given two strings, write a method to decide if one is a
	 * permutation of the other.
	 * <p>
	 * <em>Assumptions:</em>
	 * <ul>
	 * <li>The comparison is case/white space sensitive.
	 * <li>There is no limit on space complexity.
	 * <li>The characters are unicode
	 * </ul>
	 * <em>Algorithm:</em>Compare the {@link String}s by character count.
	 * <p>
	 * <em>Time complexity:</em>O(n) where n is the length of the {@link String}
	 * <p>
	 * <em>Space complexity:</em>O(k) where k is the distinct characters in
	 * <code>str1</code>. O(k) <= O(n)
	 * 
	 * @param str1 first {@link String}
	 * @param str2 second {@link String}
	 * @return true if the two {@link String}s are each others permutation, false
	 *         otherwise.
	 */
	public static boolean checkPermutation(String str1, String str2) {
		Objects.requireNonNull(str1);
		Objects.requireNonNull(str2);

		if (str1.length() != str2.length()) {
			return false;
		}

		var map = new HashMap<Character, Integer>(str1.length());

		// create character statistics
		for (var chr : str1.toCharArray()) {
			if (map.get(chr) == null) {
				map.put(chr, 0);
			}
			map.put(chr, map.get(chr) + 1);
		}

		// decrease the frequency of the characters in map
		for (var chr : str2.toCharArray()) {

			Integer frequency = map.get(chr);

			// if not found, the two Strings are not each others permutation
			if (frequency == null) {
				return false;
			}

			// remove the charater from map at the last occurence
			if (frequency == 1) {
				map.remove(chr);
			} else {

				map.put(chr, frequency - 1);
			}
		}

		return map.isEmpty();
	}

}
