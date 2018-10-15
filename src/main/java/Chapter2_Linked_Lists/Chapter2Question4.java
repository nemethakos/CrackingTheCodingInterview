package Chapter2_Linked_Lists;

import data.Node;

public class Chapter2Question4 {

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
