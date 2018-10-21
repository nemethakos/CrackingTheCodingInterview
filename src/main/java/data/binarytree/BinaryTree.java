package data.binarytree;

/**
 * Encapsulates a Binary Search Tree
 */
public class BinaryTree {
	public BinaryTree(BinaryTreeNode head) {
		super();
		this.head = head;
	}

	BinaryTreeNode head;

	public BinaryTreeNode getHead() {
		return head;
	}

	public void setHead(BinaryTreeNode head) {
		this.head = head;
	}

	public static BinaryTree from(BinaryTreeNode head) {
		return new BinaryTree(head);

	}

	@Override
	public String toString() {
		return String.format("%s", head);
	}

	public void visitNodes(BinaryTreeNodeVisitor visitor, TraversalType traversalType) {
		if (traversalType.equals(TraversalType.DEPTH_FIRST_SEARCH_PREORDER)) {
			inorderTraversal(head, visitor, 0);
		}
		else {
			throw new UnsupportedOperationException();
		}
	}

	private void inorderTraversal(BinaryTreeNode treeNode, BinaryTreeNodeVisitor visitor, int level) {
		if (treeNode == null) {
			return;
		}
		else {
			inorderTraversal(treeNode.getLeft(), visitor, level + 1);
			visitor.visit(treeNode, level);
			inorderTraversal(treeNode.getRight(), visitor, level + 1);
		}
		
	}	
}
