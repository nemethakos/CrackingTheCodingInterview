package Chapter2_Linked_Lists;

import data.Node;

public class Chapter2Question2 {

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
