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

}
