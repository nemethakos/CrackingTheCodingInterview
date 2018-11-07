package Chapter_10_Sorting_and_Searching;

import static data.util.Utils.swap;

public class SelectionSort {

	/**
	 * Sort the array by selection sort
	 * 
	 * @param arr the array sorted in-place
	 * @return the number of operations used for sorting
	 */
	public static int sort(int[] arr) {
		if (arr.length < 2) {
			return 0;
		}
		int opCount = 0;

		for (int i = 0; i < arr.length; i++) {

			int smallestElementIndex = findSmallestElementIndex(arr, i);
			opCount += arr.length - i;
			swap(arr, i, smallestElementIndex);

		}

		return opCount;
	}

	private static int findSmallestElementIndex(int[] arr, int fromIndex) {
		var minIndex = fromIndex;
		for (var i = fromIndex + 1; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		return minIndex;
	}
}
