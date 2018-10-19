package Chapter2_Linked_Lists;

import java.util.Stack;

import data.linkedlist.Node;

public class Chapter2Question6 {

	/**
	 * Palindrome: Implement a function to check if a linked list is a palindrome.
	 * 
	 * @param head the head of the list
	 * @return true if the list is a palindrome
	 */
	public static boolean isPalindromeStack(Node head) {

		// if the length is 0 or 1 it is a palindrome
		if (head == null || head.getNext() == null) {
			return true;
		}

		int length = head.getLength();

		Stack<Node> stack = new Stack<>();
		Node node = head;

		int i = 0;
		while (i++ < length / 2) {
			stack.push(node);
			node = node.getNext();
		}

		// if the length is odd, advance over the middle element
		if (length % 2 == 1) {
			node = node.getNext();
		}
		while (node != null) {
			if (!stack.pop().equals(node)) {
				return false;
			}
			node = node.getNext();
		}

		return true;
	}

}
