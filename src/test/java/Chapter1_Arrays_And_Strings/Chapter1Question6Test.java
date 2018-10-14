package Chapter1_Arrays_And_Strings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import Chapter1_Arrays_And_Strings.Chapter1Question6;

class Chapter1Question6Test {

	@Test
	void testConvertTextToRLE() {
		assertEquals(Chapter1Question6.convertTextToRLE("abba"), "ab2a");
		assertEquals(Chapter1Question6.convertTextToRLE(""), "");
		assertEquals(Chapter1Question6.convertTextToRLE("aabcccccaaa"), "a2bc5a3");
	}

}
