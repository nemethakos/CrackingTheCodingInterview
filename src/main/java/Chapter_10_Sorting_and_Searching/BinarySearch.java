package Chapter_10_Sorting_and_Searching;

public class BinarySearch {

	/**
	 * Iterative binary search
	 * 
	 * @param array the array to search in
	 * @param value the value to find
	 * @return the index of the value in the array, or -1 if not found
	 */
	public static int search(int[] array, int value) {
		int index = -1;
		int low = 0;
		int high = array.length - 1;
		int middle;
		// less than or equal is needed for the comparison
		while (low <= high) {
			middle = (low + high) / 2;
			if (value == array[middle]) {
				index = middle;
				break;
			} else if (value < array[middle]) {
				// search in the left side
				high = middle - 1;
			} else {
				// search in the right side
				low = middle + 1;
			}
		}

		return index;
	}

	/**
	 * Binary Search recursive implementation
	 * 
	 * @param array the array to search in
	 * @param value the value to find
	 * @param low   the start index in the array
	 * @param high  the end index in the array
	 * @return the index of the value or -1 if not found
	 */
	public static int searchRecursive(int[] array, int value, int low, int high) {
		if (low <= high) {
			int middle = (low + high) / 2;
			if (array[middle] == value) {
				return middle;
			} else if (array[middle] < value) {
				return searchRecursive(array, value, middle + 1, high);
			} else {
				return searchRecursive(array, value, low, middle - 1);
			}
		} else {
			return -1;
		}
	}

}
