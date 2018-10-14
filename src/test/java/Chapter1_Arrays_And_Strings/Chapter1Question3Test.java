package Chapter1_Arrays_And_Strings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import Chapter1_Arrays_And_Strings.Chapter1Question3;

class Chapter1Question3Test {

	@Test
	void testUrlifyWithoutInsert() {
		char[] charArray = "A B C          ".toCharArray();
		Chapter1Question3.urlifyWithoutInsert(charArray, 5);
		
		String result = String.copyValueOf(charArray).toString();
		
		System.out.println("urlifyWithoutInsert: '" + result + "'");
		assertEquals("A%20B%20C", result.trim());
	}
	
	@Test
	void testCountSpaces() {
		char[] str = "A B C                 ".toCharArray();
		int spaces = Chapter1Question3.countSpaces(str, 5);
		assertEquals(2, spaces);
	}
	
	@Test
	void testUrlify() {
		char[] charArray = "Mr John Smith    ".toCharArray();
		Chapter1Question3.urlifyWithInsert(charArray, 13);
		assertEquals("Mr%20John%20Smith", String.copyValueOf(charArray).toString());
	}

	@Test
	void testMove() {
		char[] charArray = " MOVE  ".toCharArray();
		Chapter1Question3.move(charArray, 1, 3, 4);
		assertEquals(" MOMOVE", String.copyValueOf(charArray).toString());
	}

}
