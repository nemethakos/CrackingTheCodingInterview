package Chapter_10_Sorting_and_Searching;

import static data.util.Utils.swap;

public class BubbleSort {

	/**
	 * Sorts the array of ints with bubble sort algorithm
	 * 
	 * @param array the array of integers
	 * @return the number of operations used to sort the array
	 */
	public static int sort(int[] array) {

		var operationCount = 0;

		// array already sorted
		if (array.length < 2) {
			return 0;
		}

		boolean swapped;
		do {
			swapped = false;

			for (var i = 0; i <= array.length - 2; i++) {
				
				if (operationCount++ >= 0 && array[i] > array[i + 1]) {
					
					swap(array, i, i + 1);
					swapped = true;
					
				}

			}

		} while (swapped);

		return operationCount;
	}
}
