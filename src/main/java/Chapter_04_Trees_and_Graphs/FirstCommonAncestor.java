package Chapter_04_Trees_and_Graphs;

import data.binarytree.BinaryTreeNode;

/**
 * <b>First Common Ancestor:</b> Design an algorithm and write code to find the
 * first common ancestor of two nodes in a binary tree. Avoid storing additional
 * nodes in a data structure. NOTE: This is not necessarily a binary search
 * tree.
 */
public class FirstCommonAncestor {

	/**
	 * Returns true, if node is under root
	 * 
	 * @param root the root node
	 * @param node the node to check
	 * @return true, if node is under the root
	 */
	private static boolean isNodeUnderRoot(BinaryTreeNode root, BinaryTreeNode node) {
		if (root == null) {
			return false;
		}
		if (root == node) {
			return true;
		}
		return isNodeUnderRoot(root.getLeft(), node) || isNodeUnderRoot(root.getRight(), node);
	}

	
	public static BinaryTreeNode getFirstCommonAncestor(BinaryTreeNode root, BinaryTreeNode node1,
			BinaryTreeNode node2) {
		// if node1 or node2 is not in the tree, return null
		if (!isNodeUnderRoot(root, node1) || !isNodeUnderRoot(root, node2)) {
			return null;
		}

		return findFirstCommonAncestor(root, node1, node2);
	}

	private static BinaryTreeNode findFirstCommonAncestor(BinaryTreeNode root, BinaryTreeNode node1, BinaryTreeNode node2) {
		if (root == null || root == node1 || root == node2) {
			return root;
		}
		
		var node1IsOnTheLeft = isNodeUnderRoot(root.getLeft(), node1);
		var node2IsOnTheLeft = isNodeUnderRoot(root.getLeft(), node2);
		
		// if nodes are on a different side, the first common node is the current root
		if (node1IsOnTheLeft != node2IsOnTheLeft) {
			return root;
		}
		else {
			// go down the tree
			BinaryTreeNode nextRoot;
			if (node1IsOnTheLeft) {
				nextRoot = root.getLeft();
			}
			else {
				nextRoot = root.getRight();
			}
			// recursive call one level down on the tree
			return findFirstCommonAncestor(nextRoot, node1, node2);
		}
	}

}
