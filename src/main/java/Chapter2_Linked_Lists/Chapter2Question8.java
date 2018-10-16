package Chapter2_Linked_Lists;

import data.Node;

public class Chapter2Question8 {

	/**
	 * <p>
	 * <b>Loop Detection: </b>Given a circular linked list, implement an algorithm
	 * that returns the node at the beginning of the loop.
	 * <p>
	 * DEFINITION
	 * <p>
	 * Circular linked list: A (corrupt) linked list in which a node's next pointer
	 * points to an earlier node, so as to make a loop in the linked list.
	 * <p>
	 * EXAMPLE
	 * <p>
	 * Input: A -> B -> C -> D -> E -> C [the same C as earlier]
	 * <p>
	 * Output: C
	 * 
	 * @param head the head of the list
	 * @return the {@link Node} at the beginning of the loop
	 */
	public static Node loopDetection(Node head) {

		Node fast = head;
		Node slow = head;
		Node collision = null;

		// find collision point
		while (fast != null) {
			slow = slow.getNext();
			fast = fast.getNext();
			if (fast != null) {
				fast = fast.getNext();
			}
			if (slow == fast) {
				collision = fast;
				break;
			}
		}

		if (collision != null) {
			Node start = head;
			while (!(start == collision)) {
				start = start.getNext();
				collision = collision.getNext();
			}
			return start;
		} else {
			return null;
		}
	}

}
