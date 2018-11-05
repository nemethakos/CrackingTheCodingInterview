package Chapter_04_Trees_and_Graphs;

import data.binarytree.BinaryTree;
import data.binarytree.BinaryTreeDepth;
import data.binarytree.BinaryTreeNode;

public class CheckBalanced {

	public static BinaryTreeDepth binaryTreeDepth(BinaryTreeNode node, int level) {
		if (node == null) {
			return new BinaryTreeDepth(level, level);
		} else {
			int leftDepth = binaryTreeDepth(node.getLeft(), level + 1).max();
			int rightDepth = binaryTreeDepth(node.getRight(), level + 1).max();
			return new BinaryTreeDepth(leftDepth, rightDepth);
		}
	}

	/**
	 * <p>
	 * <b>Check Balanced:</b> Implement a function to check if a binary tree is
	 * balanced. For the purposes of this question, a balanced tree is defined to be
	 * a tree such that the heights of the two subtrees of any node never differ by
	 * more than one.
	 * 
	 * @param tree the binary tree
	 * @return true if the binary tree is balanced, false otherwise
	 */
	public static boolean isBinaryTreeBalanced(BinaryTree tree) {
		return binaryTreeDepth(tree.getHead(), 0).isBalanced();
	}

}
