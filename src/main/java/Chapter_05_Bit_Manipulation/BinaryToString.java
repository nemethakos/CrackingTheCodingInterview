package Chapter_05_Bit_Manipulation;

/**
 * <b>Binary to String:</b> Given a real number between 0 and 1 (e.g., 0.72)
 * that is passed in as a double, print the binary representation. If the number
 * cannot be represented accurately in binary with at most 32 characters,
 * print"ERROR:'
 */
public class BinaryToString {

	/**
	 * "Multiply by two and compare to 1" implementation
	 */
	public static String binaryToString(double number) {
		if (number <= 0 || number > 1) {
			return "number (" + number + ") should be less or equals than 1 and higher than 0!";
		}

		StringBuilder sb = new StringBuilder("0.");

		while (number > 0) {

			var numberMultipliedByTwo = number * 2;

			if (sb.length() > 32) {
				return "ERROR: number=" + number + "(binary representation so far: " + sb
						+ "b) cannot be represented by a 32 bit length binary fractional number!";
			}

			if (numberMultipliedByTwo >= 1) {
				sb.append("1");
				number = numberMultipliedByTwo - 1;
			} else {
				sb.append("0");
				number = numberMultipliedByTwo;
			}
		}
		sb.append("b");
		return sb.toString();
	}

	/**
	 * Compare with 1/2, 1/4, ... implementation
	 */
	public static String binaryToString2(double number) {
		if (number <= 0 || number > 1) {
			return "number (" + number + ") should be less or equals than 1 and higher than 0!";
		}

		StringBuilder sb = new StringBuilder("0.");
		double compare = 0.5;
		while (number > 0) {
			if (sb.length() > 32) {
				return "ERROR: number=" + number + "(binary representation so far: " + sb
						+ "b) cannot be represented by a 32 bit length binary fractional number!";
			}
			if (number >= compare) {
				sb.append("1");
				number -= compare;
			} else {
				sb.append("0");
			}
			
			compare /= 2;

		}
		sb.append("b");

		return sb.toString();
	}

}
