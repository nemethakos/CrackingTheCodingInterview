package Chapter4_Trees_and_Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import data.binarytree.BinaryTree;
import data.binarytree.TraversalType;

public class ListOfDepths {

	/**
	 * <p>
	 * <b>List of Depths:</b> Given a binary tree, design an algorithm which creates
	 * a linked list of all the nodes at each depth (e.g., if you have a tree with
	 * depth D, you'll have D linked lists).
	 * 
	 * @param binaryTree the tree
	 * @return the list of {@link LinkedList}s containing the elements for the
	 *         appropriate level
	 */
	public static List<LinkedList<Integer>> getLinkedListFromBinaryTree(BinaryTree binaryTree) {

		final HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();

		binaryTree.visitNodes((node, level) -> {

			if (map.get(level) == null) {
				map.put(level, new LinkedList<Integer>());
			}

			map.get(level).add(node.getValue());

			return true;
		}, TraversalType.DEPTH_FIRST_SEARCH_PREORDER);

		return new ArrayList<LinkedList<Integer>>(map.values());
	}

}
