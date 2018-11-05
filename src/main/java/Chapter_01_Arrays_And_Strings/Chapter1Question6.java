package Chapter_01_Arrays_And_Strings;
public class Chapter1Question6 {

	/**
	 * <p>
	 * Implement a method to perform basic string compression using the counts of
	 * repeated characters. For example, the string <b>aabcccccaaa</b> would become
	 * <b>a2bc5a3</b>. If the "compressed" string would not become smaller than the
	 * original string, your method should return the original string. You can
	 * assume the string has only uppercase and lowercase letters (a - z).
	 * <p>
	 * <em>Note:</em>This algorithm differs from the requirement by not encoding
	 * single characters (e.g.: "a") to character+frequency, only the single
	 * character is put into the compressed String to avoid creating bigger
	 * compressed String than the original.
	 * 
	 * @param text the text to compress
	 * @return the compressed {@link String}
	 */
	public static String convertTextToRLE(String text) {
		StringBuilder sb = new StringBuilder(text.length());
		int i = 0;
		while (i < text.length()) {
			char c = text.charAt(i);
			int j = i + 1;
			while (j < text.length() && c == text.charAt(j)) {
				j++;
			}
			sb.append(c);
			int runLength = j - i;
			if (runLength > 1) {
				sb.append(String.valueOf(runLength));
			}
			i = j;
		}
		return sb.toString();
	}
}
