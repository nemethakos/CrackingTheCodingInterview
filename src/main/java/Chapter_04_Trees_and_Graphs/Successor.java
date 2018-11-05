package Chapter_04_Trees_and_Graphs;

import data.binarytree.BinaryTreeNode;

/**
 * <b>Successor:</b> Write an algorithm to find the "next" node (i.e., in-order
 * successor) of a given node in a binary search tree. You may assume that each
 * node has a link to its parent.
 */
public class Successor {

	/**
	 * Pseudocode:
	 * <p>
	 * 
	 * <pre>
	 * <code>
	 * Node inorderSucc(Node n) { 
	 * 		if (n has a right subtree) { 
	 * 			return leftmost child of right subtree 
	 * 		} else { 
	 * 			while (n is a right child of n.parent) {
	 * 				n = n.parent; // Go up 
	 * 			} 
	 * 			return n.parent; // Parent has not been traversed 
	 * 		} 
	 * }
	 * </code>
	 * </pre>
	 * 
	 * @param node the node to return the successor for
	 * @return the successor node for the node given as argument
	 */
	public static BinaryTreeNode getSuccessor(BinaryTreeNode node) {
		if (node == null) {
			return null;
		}

		// case #1: if there is a right child, find the leftmost child of the right
		// child
		if (node.getRight() != null) {
			return getLeftmostChild(node.getRight());
		}
		// case #2: if there is no right child, go up in the tree until the current node
		// is the right child of the parent node (or there is no parent node of the
		// current
		// node)
		else {
			while (node.getParent() != null && node == node.getParent().getRight()) {
				node = node.getParent();
			}
			return node.getParent();
		}
	}

	private static BinaryTreeNode getLeftmostChild(BinaryTreeNode n) {
		if (n == null) {
			return null;
		}
		while (n.getLeft() != null) {
			n = n.getLeft();
		}
		return n;
	}

}
