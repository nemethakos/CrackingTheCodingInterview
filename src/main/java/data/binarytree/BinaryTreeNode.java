package data.binarytree;

import javax.annotation.Generated;

/**
 * Binary Tree Node for int value
 */
public class BinaryTreeNode {

	public boolean isLeaf() {
		return left == null & right == null;
	}

	public BinaryTreeNode(int value) {
		super();
		this.value = value;
	}

	public BinaryTreeNode(BinaryTreeNode left, BinaryTreeNode right, int value) {
		super();
		this.left = left;
		this.right = right;
		this.value = value;
	}

	private BinaryTreeNode left;
	private BinaryTreeNode right;
	private int value;

	/**
	 * Builder to build {@link BinaryTreeNode}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private BinaryTreeNode left;
		private BinaryTreeNode right;
		private int value;

		private Builder() {
		}

		public BinaryTreeNode build() {
			return new BinaryTreeNode(this);
		}

		public Builder withLeft(BinaryTreeNode left) {
			this.left = left;
			return this;
		}

		public Builder withRight(BinaryTreeNode right) {
			this.right = right;
			return this;
		}

		public Builder withValue(int value) {
			this.value = value;
			return this;
		}
	}

	/**
	 * Creates builder to build {@link BinaryTreeNode}.
	 * 
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	private BinaryTreeNode(Builder builder) {
		this.left = builder.left;
		this.right = builder.right;
		this.value = builder.value;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public int getValue() {
		return value;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return BinaryTreePrinter.getNodeAsString(this);
	}

}
