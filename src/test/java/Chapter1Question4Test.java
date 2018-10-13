import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class Chapter1Question4Test {

	@Test
	void testIsPalindromePermutationASCII() {
		assertTrue(Chapter1Question4.isPalindromePermutationASCII("tact coa"));

		assertTrue(Chapter1Question4.isPalindromePermutationASCII("abccba"));
		assertTrue(Chapter1Question4.isPalindromePermutationASCII("aabbcc"));
		assertTrue(Chapter1Question4.isPalindromePermutationASCII("aabbccx"));

		assertFalse(Chapter1Question4.isPalindromePermutationASCII("abc"));
	}

	@Test
	void testIsPalindromePermutation() {

		assertTrue(Chapter1Question4.isPalindromePermutation("tact coa"));

		assertTrue(Chapter1Question4.isPalindromePermutation("abccba"));
		assertTrue(Chapter1Question4.isPalindromePermutation("aabbcc"));
		assertTrue(Chapter1Question4.isPalindromePermutation("aabbccx"));

		assertFalse(Chapter1Question4.isPalindromePermutation("abc"));

	}

}
