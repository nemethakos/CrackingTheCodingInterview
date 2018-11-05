package Chapter_04_Trees_and_Graphs;

import org.junit.jupiter.api.Test;

import Chapter_04_Trees_and_Graphs.FirstCommonAncestor;
import data.binarytree.BinaryTree;

class FirstCommonAncestorTest {

	@Test
	void testGetFirstCommonAncestor() {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		BinaryTree tree = BinaryTree.fromArray(arr);

		System.out.println(tree);

		var four = tree.findOneNodeByValue(4);
		var seven = tree.findOneNodeByValue(7);
		var ten = tree.findOneNodeByValue(10);

		var commonAncestorSevenAndTen = FirstCommonAncestor.getFirstCommonAncestor(tree.getHead(), seven, ten);

		System.out.println("Common ancestor of " + seven + " and " + ten + " is \r\n" + commonAncestorSevenAndTen);

		var commonAncestorOfFourAndTen = FirstCommonAncestor.getFirstCommonAncestor(tree.getHead(), four, ten);

		System.out.println("Common ancestor of " + four + " and " + ten + " is \r\n" + commonAncestorOfFourAndTen);

	}

}
