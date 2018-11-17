package Chapter_08_Recursion_and_Dynamic_Programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicIndexTest {

	@Test
	void testFindMagicIndex() {
		assertEquals(4, MagicIndex.findMagicIndex(-1, 0, 1, 2, 4, 6, 7, 8, 9, 10));// 4
		assertEquals(7, MagicIndex.findMagicIndex(-1, 0, 1, 2, 3, 4, 5, 7, 8, 9));// 7
	}

	@Test
	void testFindMagicIndexNonDistinctValues() {
		assertEquals(5, MagicIndex.findMagicIndexNonDistinctValues(-1, 0, 0, 0, 0, 5, 7, 8, 9));
	}

}
