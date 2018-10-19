package Chapter2_Linked_Lists;

import data.linkedlist.Node;

public class Chapter2Question2 {

	/**
	 * <p>
	 * Return Kth to Last: Implement an algorithm to find the kth to last element of
	 * a singly linked list.
	 * <p>
	 * Note: if k==0, the last element is returned!
	 * 
	 * @param head
	 * @param k
	 * @return
	 */
	public static Node getKthToLast(Node head, int k) {

		Node lead = head;
		Node kthToLast = head;

		k++;
		while (lead != null && k > 0) {
			lead = lead.getNext();
			k--;
		}

		if (k != 0) {
			// the list doesn't have k element
			return null;
		}

		while (lead != null) {
			lead = lead.getNext();
			kthToLast = kthToLast.getNext();
		}

		return kthToLast;
	}

}
