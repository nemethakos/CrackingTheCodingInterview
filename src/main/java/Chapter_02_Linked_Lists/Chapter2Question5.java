package Chapter_02_Linked_Lists;

import data.linkedlist.Node;

public class Chapter2Question5 {

	/**
	 * <p>
	 * Sum Lists: You have two numbers represented by a linked list, where each node
	 * contains a single digit. The digits are stored in reverse order, such that
	 * the 1 's digit is at the head of the list. Write a function that adds the two
	 * numbers and returns the sum as a linked list.
	 * <p>
	 * EXAMPLE
	 * <p>
	 * Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
	 * <p>
	 * Output: 2 -> 1 -> 9. That is, 912.
	 * 
	 * @param list1 the first list
	 * @param list2 the second list
	 * @return the result list
	 */
	public static Node sumLists(Node list1, Node list2) {

		Node result = null;
		Node resultLast = null;

		int carry = 0;

		while (list1 != null || list2 != null) {
			int digit1 = 0;
			int digit2 = 0;

			if (list1 != null) {
				digit1 = list1.getValue();
				list1 = list1.getNext();
			}

			if (list2 != null) {
				digit2 = list2.getValue();
				list2 = list2.getNext();
			}

			int sum = digit1 + digit2 + carry;
			int sumDigit = sum % 10;
			carry = sum / 10;

			if (result == null) {
				result = new Node(sumDigit);
				resultLast = result;
			} else {
				resultLast.setNext(new Node(sumDigit));
				resultLast = resultLast.getNext();
			}

		}
		if (carry > 0) {
			resultLast.setNext(new Node(carry));
		}

		return result;

	}

}
