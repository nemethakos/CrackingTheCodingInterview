package Chapter_02_Linked_Lists;

import data.linkedlist.Node;

public class Chapter2Question7 {

	/**
	 * <p>
	 * <b>Intersection:</b> Given two (singly) linked lists, determine if the two
	 * lists intersect. Return the intersecting node. Note that the intersection is
	 * defined based on reference, not value. That is, if the kth node of the first
	 * linked list is the exact same node (by reference) as the jth node of the
	 * second linked list, then they are intersecting.
	 * 
	 * @param list1 the first list
	 * @param list2 the second list
	 * @return the intersecting Node or null if there is no intersecting node
	 */
	public static Node getIntersectingNode(Node list1, Node list2) {

		// if one list is null, there is no intersection
		if (list1 == null || list2 == null) {
			return null;
		}

		int list1Length = list1.getLength();
		int list2Length = list2.getLength();

		// if one of the list contains only one node, there is no intersection
		if (list1Length == 1 || list2Length == 1) {
			return null;
		}

		int commonLength = Math.abs(list2Length - list1Length);

		Node list1Start = list1.skip(list1Length - commonLength - 1);
		Node list2Start = list2.skip(list2Length - commonLength - 1);

		if (list1Start.getNext() != null &&// 
			list2Start.getNext() != null &&// 
			list1Start.getNext().equals(list2Start.getNext())) {
			return list1Start.getNext();
		} else {
			return null;
		}
	}
}
