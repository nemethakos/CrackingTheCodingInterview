package Chapter_02_Linked_Lists;

import data.linkedlist.Node;

public class Chapter2Question3 {

	/**
	 * <em>Delete Middle Node:</em> Implement an algorithm to delete a node in the
	 * middle (i.e., any node but the first and last node, not necessarily the exact
	 * middle) of a singly linked list, given only access to that node.
	 * <p>
	 * EXAMPLE input:the node c from the linked lista->b->c->d->e->f
	 * <p>
	 * Result: nothing is returned, but the new linked list looks like a->b->d->e->f
	 * <p>
	 * <em>Note:</em>The algorithm is to copy the data from the next node over to
	 * the current node, and then to delete the next node. (Technically, the middle
	 * node is not deleted). This problem cannot be solved if the node to be deleted
	 * is the last node in the linked list.
	 * 
	 * @param middle the node to delete
	 * 
	 */
	public static Node deleteMiddleNode(Node middle) {
		Node next = middle.getNext();

		if (next != null) {
			middle.setValue(next.getValue());
			middle.setNext(next.getNext());
		}

		return middle;

	}

}
