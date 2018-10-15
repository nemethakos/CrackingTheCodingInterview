package Chapter2_Linked_Lists;

import data.Node;

public class Chapter2Question4 {

	/**
	 * <p>
	 * Write code to partition a linked list around a value x, such that all nodes
	 * less than x come before all nodes greater than or equal to x. If x is
	 * contained within the list, the values of x only need to be after the elements
	 * less than x (see below). The partition element x can appear anywhere in the
	 * "right partition"; it does not need to appear between the left and right
	 * partitions.
	 * <p>
	 * EXAMPLE
	 * <p>
	 * Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
	 * <p>
	 * Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
	 * 
	 * @param head  head of the linked list
	 * @param value the partitioning value
	 * @return the partitioned list (the "head" list will be modified)
	 */
	public static Node partition(Node head, int value) {

		Node lowerHead = null;
		Node lowerLast = null;

		Node higherHead = null;
		Node higherLast = null;

		Node node = head;

		while (node != null) {
			Node nextNode = node.getNext();
			if (node.getValue() < value) {
				// add to the lower list
				if (lowerHead == null) {
					lowerHead = node;
					lowerLast = node;
				} else {
					lowerLast.setNext(node);
					lowerLast = node;
				}
				lowerLast.setNext(null);
			} else {
				// add to the higher list
				if (higherHead == null) {
					higherHead = node;
					higherLast = node;
				} else {
					higherLast.setNext(node);
					higherLast = node;
				}
				higherLast.setNext(null);
			}
			node = nextNode;
		}

		return merge(lowerHead, higherHead);
	}

	protected static Node merge(Node lowerHead, Node higherHead) {

		if (lowerHead == null) {
			return higherHead;
		}
		Node node = lowerHead;
		while (node.getNext() != null) {
			node = node.getNext();
		}

		node.setNext(higherHead);

		return lowerHead;

	}

}
