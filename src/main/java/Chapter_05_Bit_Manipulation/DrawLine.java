package Chapter_05_Bit_Manipulation;

/**
 * <p>
 * <b>Draw Line:</b> A monochrome screen is stored as a single array of bytes,
 * allowing eight consecutive pixels to be stored in one byte. The screen has
 * width w, where w is divisible by 8 (that is, no byte will be split across
 * rows). The height of the screen, of course, can be derived from the length of
 * the array and the width. Implement a function that draws a horizontal line
 * from ( x1, y) to ( x2, y). The method signature should look something like:
 * <code>drawline(byte[] screen, int width, int x1, int x2, int y)</code>
 */
public class DrawLine {

	/**
	 * Prints the screen buffer. Background is printed as ".", foreground is printed
	 * as "*".
	 * 
	 * @param screen the screen buffer
	 * @param width  the width of the screen in pixels
	 */
	public static void printScreen(byte[] screen, int width) {
		int height = (screen.length * 8) / width;
		printHeader(width, height);
		int index = 0;
		int columnIndex = 0;
		int rowIndex = 0;
		while (index <= screen.length - 1) {

			if (columnIndex == 0) {
				System.out.print(rowIndex + "\t");
			}

			printByte(screen[index]);
			columnIndex++;
			index++;

			if (columnIndex == (width / 8)) {
				System.out.println();
				columnIndex = 0;
				rowIndex++;
			}
		}
	}

	/**
	 * Prints a header: width x heigh and pixel position every 8 pixels
	 * 
	 * @param width  the width of the screen buffer in pixels
	 * @param height the height of the screen buffer in pixels
	 */
	private static void printHeader(int width, int height) {
		System.out.print("" + width + "x" + height + "\t");
		for (int i = 0; i < width / 8; i++) {
			System.out.format("%9d", (i + 1) * 8 - 1);
		}
		System.out.println();
	}

	/**
	 * <p>
	 * Prints the pattern's lower 8 bit (first MSB, last LSB), at the end a "|" char
	 * is printed. E.g.:
	 * <ul>
	 * <li>
	 * 
	 * <pre>
	 * 0x01 is printed as: .......*|
	 * </pre>
	 * 
	 * <li>
	 * 
	 * <pre>
	 * 0x80 is printed as: *.......|
	 * </pre>
	 * 
	 * <li>
	 * 
	 * <pre>
	 * 0xAA is printed as: *.*.*.*.|
	 * </pre>
	 * </ul>
	 * 
	 * @param pattern the pattern
	 */
	public static void printByte(int pattern) {
		char c = ' ';
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= 7; i++) {
			if ((pattern & 0b0_1000_0000) != 0) {
				c = '*';
			} else {
				c = '.';
			}
			pattern = (pattern << 1);
			sb.append(c);
		}
		System.out.print(sb.toString() + "|");
	}

	/**
	 * Draws a horizontal line
	 * 
	 * @param screen the byte array storing the pixel data
	 * @param width  the width of the screen in bytes (pixels*8)
	 * @param xl     start pixel column
	 * @param x2     end pixel column
	 * @param y      pixel row
	 */
	public static void drawline(byte[] screen, int width, int x1, int x2, int y) {
		int height = (screen.length * 8) / width;
		if (y >= height) {
			return;
		}
		if (x2 < x1) {
			int tmp = x1;
			x1 = x2;
			x2 = tmp;
		}
		if (x1 >= width) {
			return;
		}
		// clipping
		if (x1 < 0) {
			x1 = 0;
		}
		if (x2 >= width) {
			x2 = width - 1;
		}

		// index of the first byte in the screen buffer of the row of the line
		int lineIndex = y * (width / 8);

		// index of the first byte of the line
		int startIndex = lineIndex + x1 / 8;
		int startBit = 8 - (x1 & 0b0_111);
		// value of the first byte of the line
		int startByte = getByte(startBit);

		// index of the last byte of the line
		int endIndex = lineIndex + x2 / 8;
		int endBit = 7 - (x2 & 0b0_111);
		// value of the last byte of the line
		int endByte = getByte(endBit) ^ 0xff;

		byte pattern = 0;

		// if the start and end index is the same byte index, the width of the line is less than 8 pixels.
		// the start and end patterns are AND-ed together
		if (startIndex == endIndex) {
			pattern = (byte) (startByte & endByte);
			screen[startIndex] = pattern;
		} else {
			// iterate from start index to end index
			for (int byteIndex = startIndex; byteIndex <= endIndex; byteIndex++) {
				// start value for first byte of the line
				if (byteIndex == startIndex) {
					pattern = (byte) startByte;
				// end value for last byte of the line
				} else if (byteIndex == endIndex) {
					pattern = (byte) endByte;
				// intermittent bytes are filled with 0xff (0b0_1111_1111)
				} else {
					pattern = (byte) 0xff;
				}
				screen[byteIndex] = pattern;
			}
		}
	}

	/**
	 * <p>
	 * Returns a bit pattern in the following form:
	 * 
	 * <pre>
	 * 	0	........|
	 *	1	.......*|
	 *	2	......**|
	 *	3	.....***|
	 *	4	....****|
	 *	5	...*****|
	 *	6	..******|
	 *	7	.*******|
	 *	8	********|
	 * </pre>
	 * 
	 * @param startBit the start index of the bit to fill
	 * @return value representing the pattern
	 */
	public static int getByte(int startBit) {
		int result = 0;
		while (startBit != 0) {
			result = result << 1;
			result = result | 1;
			startBit--;
		}
		return result;
	}
}
