package Chapter4_Trees_and_Graphs;

import org.junit.jupiter.api.Test;

class ListOfDepthsTest {

	@Test
	void testGetLinkedListFromBinaryTree() {

		var tree = MinimalTree.getBSTFromSortedArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		System.out.println("Original tree:\r\n" + tree);

		System.out.println("Linked Lists by Depth: " + ListOfDepths.getLinkedListFromBinaryTree(tree));
	}

}
