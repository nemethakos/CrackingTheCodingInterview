package Chapter4_Trees_and_Graphs;

import data.binarytree.BinaryTree;
import data.binarytree.BinaryTreeNode;

/**
 * <p>
 * <b>Minimal Tree:</b> Given a sorted (increasing order) array with unique
 * integer elements, write an algorithm to create a binary search tree with
 * minimal height.
 */
public class MinimalTree {

	private static BinaryTreeNode getBinaryTreeFrom(int[] array, int lowIndex, int highIndex) {

		if (lowIndex > highIndex) {
			return null;
		}

		int medianIndex = (highIndex + lowIndex) / 2;

		int nodeValue = array[medianIndex];

		BinaryTreeNode left = getBinaryTreeFrom(array, lowIndex, medianIndex - 1);
		BinaryTreeNode right = getBinaryTreeFrom(array, medianIndex + 1, highIndex);

		return BinaryTreeNode//
				.builder()//
				.withValue(nodeValue)//
				.withLeft(left)//
				.withRight(right)//
				.build();

	}

	public static BinaryTree getBSTFromSortedArray(int[] sortedArray) {
		var head = getBinaryTreeFrom(sortedArray, 0, sortedArray.length - 1);
		return BinaryTree.from(head);
	}

}
