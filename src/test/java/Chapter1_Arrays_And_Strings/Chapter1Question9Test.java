package Chapter1_Arrays_And_Strings;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import Chapter1_Arrays_And_Strings.Chapter1Question9;

class Chapter1Question9Test {

	@Test
	void testIsSubstringWithRotatedString() {
		assertTrue(Chapter1Question9.isSubstringWithRotatedString("waterbottle", "erbottlewat"));
		assertFalse(Chapter1Question9.isSubstringWithRotatedString("abba", "baba"));

	}

}
