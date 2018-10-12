import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter1Question1Test {

	private static final String UNIQUE_SORT = "a";
	private static final String UNIQUE_EMPTY = "";
	private static final String NOT_UNIQUE_ABRACADABRA = "abracadabra";
	private static final String UNIQUE_ABCDEF = "abcdef";

	@Test
	void testIsUniqueWithBruteForce() {

		assertTrue(Chapter1Question1.isUniqueWithBruteForce(UNIQUE_EMPTY));

		assertTrue(Chapter1Question1.isUniqueWithBruteForce(UNIQUE_SORT));

		assertTrue(Chapter1Question1.isUniqueWithBruteForce(UNIQUE_ABCDEF));

		assertFalse(Chapter1Question1.isUniqueWithBruteForce(NOT_UNIQUE_ABRACADABRA));

	}

	@Test
	void testIsUniqueWithHashMap() {

		assertTrue(Chapter1Question1.isUniqueWithHashMap(UNIQUE_EMPTY));

		assertTrue(Chapter1Question1.isUniqueWithHashMap(UNIQUE_SORT));

		assertTrue(Chapter1Question1.isUniqueWithHashMap(UNIQUE_ABCDEF));

		assertFalse(Chapter1Question1.isUniqueWithHashMap(NOT_UNIQUE_ABRACADABRA));

	}

	@Test
	void testisUniqueWithSorting() {

		assertTrue(Chapter1Question1.isUniqueWithSorting(UNIQUE_EMPTY));

		assertTrue(Chapter1Question1.isUniqueWithSorting(UNIQUE_SORT));

		assertTrue(Chapter1Question1.isUniqueWithSorting(UNIQUE_ABCDEF));

		assertFalse(Chapter1Question1.isUniqueWithSorting(NOT_UNIQUE_ABRACADABRA));
	}

	@Test
	void testIsUniqueWithBitmap() {

		assertTrue(Chapter1Question1.isUniqueWithBitmap(UNIQUE_EMPTY));

		assertTrue(Chapter1Question1.isUniqueWithBitmap(UNIQUE_SORT));

		assertTrue(Chapter1Question1.isUniqueWithBitmap(UNIQUE_ABCDEF));

		assertFalse(Chapter1Question1.isUniqueWithBitmap(NOT_UNIQUE_ABRACADABRA));
	}

}
