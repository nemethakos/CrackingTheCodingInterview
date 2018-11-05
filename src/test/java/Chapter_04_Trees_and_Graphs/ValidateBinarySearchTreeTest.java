package Chapter_04_Trees_and_Graphs;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import Chapter_04_Trees_and_Graphs.MinimalTree;
import Chapter_04_Trees_and_Graphs.ValidateBinarySearchTree;
import data.binarytree.BinaryTree;
import data.binarytree.BinaryTreeNode;

class ValidateBinarySearchTreeTest {

	@Test
	void testIsBinarySearchTree() {
		var tree = MinimalTree.getBSTFromSortedArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		System.out.println(tree);

		System.out.println("isBST: " + ValidateBinarySearchTree.isBinarySearchTree(tree));
		assertTrue(ValidateBinarySearchTree.isBinarySearchTree(tree));

		var root = new BinaryTree(new BinaryTreeNode(
				new BinaryTreeNode(new BinaryTreeNode(new BinaryTreeNode(0), new BinaryTreeNode(99), 1),
						new BinaryTreeNode(8), 1),
				new BinaryTreeNode(2), 100));

		System.out.println("\r\n\r\n" + root);

		System.out.println("isBST: " + ValidateBinarySearchTree.isBinarySearchTree(root));
		assertFalse(ValidateBinarySearchTree.isBinarySearchTree(root));
	}

}
