package util;

import java.util.Arrays;
import java.util.Objects;

import data.linkedlist.Node;

public class Utils {

	public static int[] getArrayToSort(int length) {
		int[] result = new int[length];
		int j = 0;
		for (var i = length - 1; i >= 0; i--) {
			result[j++] = i;
		}
		return result;
	}

	public static int[] getArrayToSort(int length, int initialValue, int delta) {
		int[] result = new int[length];

		for (var i = 0; i < length; i++) {
			result[i] = initialValue;
			initialValue += delta;
		}
		return result;
	}

	/**
	 * Returns true if the array is sorted
	 * 
	 * @param array the int array
	 * @return true if the array is sorted
	 */
	public static boolean isSorted(int[] array) {
		if (array.length < 2) {
			return true;
		}
		for (var i = 0; i <= array.length - 2; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns the tail of the linked list
	 * 
	 * @param head the head of the linked list
	 * @return the tail of the linked list
	 */
	public static Node tail(Node head) {

		if (head == null) {
			return null;
		}

		while (head.getNext() != null) {
			head = head.getNext();
		}

		return head;
	}

	/**
	 * Returns true, if the two linked list, given by their head nodes, has the same
	 * values and the same length.
	 * 
	 * @param first  head node of the first linked list
	 * @param second head node of the second linked list
	 * @return true, if the two list are equals, false otherwise.
	 */
	public static boolean equalLinkedList(Node first, Node second) {
		while (first != null && second != null) {
			if (!first.equals(second)) {
				return false;
			}
			first = first.getNext();
			second = second.getNext();
		}

		return Objects.equals(first, second);
	}

	/**
	 * Returns true, if the two matrix equals. Does not check dimensions.
	 * 
	 * @param matrix1 the first matrix
	 * @param matrix2 the second matrix
	 * @return true, if the values in the first matrix equals to the second matrix
	 *         values.
	 */
	public static boolean equalMatrix(int[][] matrix1, int[][] matrix2) {

		int rowNum = matrix1.length;
		int colNum = matrix1[0].length;

		for (int row = 0; row < rowNum; row++) {
			for (int col = 0; col < colNum; col++) {
				if (matrix1[row][col] != matrix2[row][col]) {
					return false;
				}
			}
		}

		return true;
	}

	public static String arrayToString(String label, int[] arr) {
		return label + ": " + Arrays.deepToString(Arrays.asList(arr).toArray());
	}

}
