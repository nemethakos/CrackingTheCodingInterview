package data.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

	@Test
	void testGetBSTFromArray() {
		BinaryTree tree = BinaryTree.fromArray(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		System.out.println(tree);

		System.out.print("\r\ninorder: ");
		tree.visitNodes((node, level) -> {

			System.out.print(node.getValue());

			return true;
		}, TraversalType.DEPTH_FIRST_SEARCH_INORDER);

		System.out.print("\r\npreorder: ");
		tree.visitNodes((node, level) -> {

			System.out.print(node.getValue());

			return true;
		}, TraversalType.DEPTH_FIRST_SEARCH_PREORDER);
		
		System.out.print("\r\npostorder: ");
		tree.visitNodes((node, level) -> {

			System.out.print(node.getValue());

			return true;
		}, TraversalType.DEPTH_FIRST_SEARCH_POSTORDER);

	}

}
