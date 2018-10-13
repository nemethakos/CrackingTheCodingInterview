
public class Chapter1Question3 {

	/**
	 * <p>
	 * Algorithm: Copy the non space parts and insert "%20" when space encountered.
	 * <p>
	 * Assumptions: the length of <code>str</code> is greater or equals the number
	 * of non-space characters plus 3 x the space characters. But it could be longer
	 * then "necessary"
	 * <p>
	 * Write a method to replace all <b>spaces</b> in a string with
	 * <code>'%20'</code>. You may assume that the string has sufficient space at
	 * the end to hold the additional characters, and that you are given the "true"
	 * length of the string.
	 * <p>
	 * (Note: If implementing in Java, please use a character array so that you can
	 * perform this operation in place.)
	 * <p>
	 * EXAMPLE Input: "Mr John Smith ", 13
	 * <p>
	 * Output: "Mr%20John%20Smith"
	 * 
	 * @param str    the character array containing the String. The character array
	 *               is modified in-place.
	 * @param length the length of the content in the character array
	 */
	public static void urlifyWithoutInsert(char[] str, int length) {
		int spaces = countSpaces(str, length);
		int to = length - 1 + spaces * 2;
		int from = length - 1;
		while (from > 0) {
			char c = str[from--];
			if (c == ' ') {
				to -= 3;
				str[to + 1] = '%';
				str[to + 2] = '2';
				str[to + 3] = '0';
				
			} else {
				str[to--] = c;
			}

		}
	}

	protected static int countSpaces(char[] str, int length) {
		var result = 0;

		for (var i = 0; i < length; i++) {
			if (str[i] == ' ') {
				result++;
			}
		}

		return result;
	}

	/**
	 * <p>
	 * Write a method to replace all <b>spaces</b> in a string with
	 * <code>'%20'</code>. You may assume that the string has sufficient space at
	 * the end to hold the additional characters, and that you are given the "true"
	 * length of the string.
	 * <p>
	 * (Note: If implementing in Java, please use a character array so that you can
	 * perform this operation in place.)
	 * <p>
	 * EXAMPLE Input: "Mr John Smith ", 13
	 * <p>
	 * Output: "Mr%20John%20Smith"
	 * 
	 * @param str    the character array containing the String. The character array
	 *               is modified in-place.
	 * @param length the length of the content in the character array
	 */
	public static void urlifyWithInsert(char[] str, int length) {
		int i = 0;
		while (i < length) {
			// find the next white space
			while (i < length && str[i] != ' ') {
				i++;
			}
			if (i < length && str[i] == ' ') {
				move(str, i + 1, i + 3, length - i - 1);
				str[i] = '%';
				str[i + 1] = '2';
				str[i + 2] = '0';
				i += 2;
				length += 2;
			}
		}
	}

	/**
	 * Move part of the character array from <code>from</code> index to
	 * <code>to</code> index with <code>length</code> length.
	 * 
	 * @param str    the character array
	 * @param from   the from index (to > from)
	 * @param to     the to index
	 * @param length the number of characters to copy
	 */
	protected static void move(char[] str, int from, int to, int length) {
		int destinationIndex = to + length - 1;
		int sourceIndex = from + length - 1;
		int count = length;

		while (count > 0) {
			str[destinationIndex--] = str[sourceIndex--];
			count--;
		}
	}

}
