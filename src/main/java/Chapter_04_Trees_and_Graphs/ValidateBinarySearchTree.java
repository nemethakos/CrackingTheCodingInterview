package Chapter_04_Trees_and_Graphs;

import java.util.concurrent.atomic.AtomicBoolean;

import data.binarytree.BinaryTree;
import data.binarytree.TraversalType;

public class ValidateBinarySearchTree {

	public static boolean isBinarySearchTree(BinaryTree tree) {

		AtomicBoolean result = new AtomicBoolean(true);

		tree.visitNodes((node, level) -> {

			boolean isBSTNode = true;

			if (node.getLeft() != null) {
				isBSTNode &= node.getLeft().getValue() < node.getValue();
			}
			if (node.getRight() != null) {
				isBSTNode &= node.getValue() < node.getRight().getValue();
			}

			if (!isBSTNode) {
				result.set(false);
			}

			return isBSTNode;

		}, TraversalType.DEPTH_FIRST_SEARCH_INORDER);

		return result.get();
	}

}
