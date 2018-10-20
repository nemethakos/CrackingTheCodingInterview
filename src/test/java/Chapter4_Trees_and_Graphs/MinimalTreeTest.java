package Chapter4_Trees_and_Graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimalTreeTest {

	@Test
	void testGetBSTFromSortedArray() {
		var result = MinimalTree.getBSTFromSortedArray(new int[]{1,2,3,4,5,6,7,8,9});
		System.out.println(result);
	}

}
