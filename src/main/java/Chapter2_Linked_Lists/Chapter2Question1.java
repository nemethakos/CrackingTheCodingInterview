package Chapter2_Linked_Lists;

import java.util.HashSet;
import java.util.Set;

import data.Node;

public class Chapter2Question1 {

	/**
	 * <em>Remove Dups:</em> Write code to remove duplicates from an unsorted linked
	 * list.
	 * 
	 * @param head the head of the linked list
	 * @return the linked list without the duplicates (also the original linked list
	 *         is modified in-place)
	 */
	public static Node removeDuplicates(Node head) {
		Set<Integer> set = new HashSet<>();

		Node node = head;
		Node prev = null;

		while (node != null) {
			int value = node.getValue();
			if (!set.contains(value)) {
				set.add(value);
				prev = node;
				node = node.getNext();
			} else {
				// value already contained, remove node
				Node next = node.getNext();
				prev.setNext(next);
				node = next;
			}
		}

		return head;
	}

	/**
	 * <em>Remove Dups:</em> Write code to remove duplicates from an unsorted linked
	 * list. How would you solve this problem if a temporary buffer is not allowed?
	 * 
	 * @param head the head of the linked list
	 * @return the linked list without the duplicates (also the original linked list
	 *         is modified in-place)
	 */
	public static Node removeDuplicatesWithoutTemporaryBuffer(Node head) {

		Node node = head;
		Node prev = null;
		Node other = null;
		while (node != null) {

			other = node.getNext();
			prev = node;
			while (other != null) {
				if (node.equals(other)) {
					// remove other
					prev.setNext(other.getNext());
				}
				other = other.getNext();
			}
			node = node.getNext();
		}
		return head;

	}

}
