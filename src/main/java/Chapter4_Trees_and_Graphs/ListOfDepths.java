package Chapter4_Trees_and_Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import data.binarytree.BinaryTree;
import data.binarytree.TraversalType;

public class ListOfDepths {

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
