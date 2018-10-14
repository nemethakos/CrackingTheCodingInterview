package Chapter1_Arrays_And_Strings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import Chapter1_Arrays_And_Strings.Chapter1Question2;

class Chapter1Question2Test {

	@Test
	void testCheckPermutation() {

		assertTrue(Chapter1Question2.checkPermutation("", ""));

		assertTrue(Chapter1Question2.checkPermutation("abba", "baba"));

		assertFalse(Chapter1Question2.checkPermutation("abc", "abcd"));

		assertFalse(Chapter1Question2.checkPermutation("abc", "abd"));

		assertThrows(NullPointerException.class, () -> Chapter1Question2.checkPermutation(null, "abd"));
		assertThrows(NullPointerException.class, () -> Chapter1Question2.checkPermutation("", null));

	}

}
