package Chapter_04_Trees_and_Graphs;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import Chapter_04_Trees_and_Graphs.CheckBalanced;
import Chapter_04_Trees_and_Graphs.MinimalTree;
import data.binarytree.BinaryTree;
import data.binarytree.BinaryTreeNode;

class CheckBalancedTest {

	@Test
	void testIsBinaryTreeBalanced() {
		var tree = MinimalTree.getBSTFromSortedArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		System.out.println(tree);

		System.out.println("Depth: " + CheckBalanced.binaryTreeDepth(tree.getHead(), 0));
		System.out.println("isBalanced: " + CheckBalanced.isBinaryTreeBalanced(tree));
		assertTrue(CheckBalanced.isBinaryTreeBalanced(tree));

		BinaryTreeNode root = new BinaryTreeNode(
				new BinaryTreeNode(new BinaryTreeNode(new BinaryTreeNode(0), new BinaryTreeNode(99), 1),
						new BinaryTreeNode(8), 1),
				new BinaryTreeNode(2), 100);
		
		System.out.println("\r\n\r\n"+root);
		System.out.println("Depth: " + CheckBalanced.binaryTreeDepth(root, 0));
		System.out.println("isBalanced: " + CheckBalanced.isBinaryTreeBalanced(new BinaryTree(root)));
		assertFalse(CheckBalanced.isBinaryTreeBalanced(new BinaryTree(root)));
	}
}
