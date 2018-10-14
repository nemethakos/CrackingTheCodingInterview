package Chapter1_Arrays_And_Strings;

public class Chapter1Question9 {

	/**
	 * <em>String Rotation:</em>Assume you have a method isSubstring which checks if
	 * one word is a substring of another. Given two strings, sl and s2, write code
	 * to check if s2 is a rotation of s1 using only one call to isSubstring (e.g.,
	 * <code>"waterbottle"</code> is a rotation of <code>"erbottlewat"</code>).
	 * 
	 * @param s1 the original {@link String}
	 * @param s2 the (possible) rotated version of s1
	 * @return true, if s2 is a rotation of s1
	 */
	public static boolean isSubstringWithRotatedString(String s1, String s2) {
		return isSubstring("" + s2 + s2, s1); 
	}

	protected static boolean isSubstring(String string, String substring) {
		return string.indexOf(substring) != -1;
	}

}
