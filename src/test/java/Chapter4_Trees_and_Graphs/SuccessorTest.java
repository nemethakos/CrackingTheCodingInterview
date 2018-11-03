package Chapter4_Trees_and_Graphs;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import data.binarytree.BinaryTree;
import data.binarytree.BinaryTreeNode;
import data.binarytree.TraversalType;

class SuccessorTest {

	@Test
	void testGetSuccessor() {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		BinaryTree tree = BinaryTree.fromArray(arr);

		System.out.println(tree);

		List<BinaryTreeNode> nodes = new ArrayList<>();

		tree.visitNodes((node, level) -> {
			nodes.add(node);
			return true;
		}, TraversalType.DEPTH_FIRST_SEARCH_INORDER);

		// System.out.println(nodes);

		for (var node : nodes) {
			var successor = Successor.getSuccessor(node);
			var successorValueStr = "null";
			var parentValueStr = "null";
			if (successor != null) {
				successorValueStr = "" + successor.getValue();
			}
			if (node.getParent() != null) {
				parentValueStr = "" + node.getParent().getValue();
			}
			System.out.println(" {" + parentValueStr + "} <= " + node.getValue() + " -> " + successorValueStr);

			if (successor == null) {
				// only the last element has no successor
				assertEquals(node.getValue(), arr[arr.length - 1]);
			} else {
				// successor should be greater by one than the node
				assertEquals(node.getValue() + 1, successor.getValue());
			}

		}

	}

}
