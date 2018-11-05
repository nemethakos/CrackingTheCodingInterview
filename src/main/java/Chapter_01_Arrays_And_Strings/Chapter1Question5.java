package Chapter_01_Arrays_And_Strings;
import java.util.Objects;

public class Chapter1Question5 {

	/**
	 * <p>
	 * There are three types of edits that can be performed on strings:
	 * <ul>
	 * <li>insert a character,
	 * <li>remove a character, or
	 * <li>replace a character.
	 * </ul>
	 * <p>
	 * Given two strings, write a function to check if they are one edit (or zero
	 * edits) away.
	 * 
	 * @param str1 first {@link String}
	 * @param str2 second {@link String}
	 * @return true if the edit distance is 1 or zero
	 */
	public static boolean isOneEditDistanceBetweenStrings(String str1, String str2) {
		Objects.requireNonNull(str1);
		Objects.requireNonNull(str2);

		if (str1.equals(str2)) {
			return true;
		}

		if (Math.abs(str1.length() - str2.length()) > 1) {
			return false;
		}

		// replace
		if (str1.length() == str2.length()) {
			var changeCount = 0;
			for (var i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					changeCount++;
					if (changeCount > 1) {
						return false;
					}
				}
			}
			return true;
		}
		// str1 always longer than str2
		if (str1.length() < str2.length()) {
			var tmp = str1;
			str1 = str2;
			str2 = tmp;
		}

		var index1 = 0;
		var index2 = 0;
		var changeCount = 0;
		while (index2 < str2.length()) {
			
			if (str1.charAt(index1) != str2.charAt(index2)) {
				changeCount++;
				if (changeCount > 1) {
					return false;
				}
				index1++;
			} else {
				index1++;
				index2++;
			}

		}

		return true;
	}

}
