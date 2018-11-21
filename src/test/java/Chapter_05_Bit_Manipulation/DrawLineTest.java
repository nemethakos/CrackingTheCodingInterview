package Chapter_05_Bit_Manipulation;

import org.junit.jupiter.api.Test;

class DrawLineTest {

	@Test
	void testGetByte() {
		for (int i=0; i<=8; i++) {
			System.out.print(""+i+"\t");
			DrawLine.printByte(DrawLine.getByte(i));
			System.out.println();
		}
	}
	
	@Test
	void testPrintScreen() {
		int width = 8;
		int height = 32;
		byte[] screen = new byte[width * height];
		byte pattern = 0;
		for (int i = 0; i < screen.length; i++) {
			screen[i] = pattern++;
		}
		DrawLine.printScreen(screen, width * 8);
	}

	@Test
	void testDrawline() {
		int width = 8;
		int height = 32;
		byte[] screen = new byte[width * height];
		int x1;
		int x2;
		int y;
		for (int x = 0; x < width * 8; x++) {
		    x1 = x*2;
		    x2 = width*8-x*2;
		    y = x;
			DrawLine.drawline(screen, width * 8, x1, x2, y);
		}
		DrawLine.printScreen(screen, width * 8);
	}

}
