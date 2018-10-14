package Chapter1_Arrays_And_Strings;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import Chapter1_Arrays_And_Strings.Chapter1Question5;

class Chapter1Question5Test {

	@Test
	void testIsOneEditDistanceBetweenStrings() {
		assertTrue(Chapter1Question5.isOneEditDistanceBetweenStrings("pale", "ple"));
		assertTrue(Chapter1Question5.isOneEditDistanceBetweenStrings("pales", "pale"));
		assertTrue(Chapter1Question5.isOneEditDistanceBetweenStrings("pale", "bale"));

		
		assertFalse(Chapter1Question5.isOneEditDistanceBetweenStrings("pale", "bake"));
		
		assertFalse(Chapter1Question5.isOneEditDistanceBetweenStrings("abcd", "axxd"));
		assertFalse(Chapter1Question5.isOneEditDistanceBetweenStrings("abcd", "abxx"));
		
	}
	

}
