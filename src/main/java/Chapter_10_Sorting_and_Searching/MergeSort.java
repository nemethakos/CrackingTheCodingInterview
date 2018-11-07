package Chapter_10_Sorting_and_Searching;

public class MergeSort {
	/**
	 * Sort the array by merge sort
	 * 
	 * @param arr the array to be sorted
	 * 
	 * @return the number of operations used for sorting
	 */
	public static int sort(int[] array) {
		var opCount = 0;

		// create temporary array with the same size as the original array
		int[] tmpArr = new int[array.length];

		// call the recursive merge sort
		opCount += mergeSort(array, tmpArr, 0, array.length - 1);

		return opCount;
	}

	/**
	 * Recursive merge sort
	 * 
	 * @param array the array to sort
	 * @param tmp   temporary array used for merging
	 * @param low   start index of sorting
	 * @param high  end index of sorting
	 * @return number of operations used for sorting
	 */
	private static int mergeSort(int[] array, int[] tmp, int low, int high) {

		//System.out.println("sort: " + low + "-" + high);

		var opCount = 1;

		if (low < high) {
			// divide the part of the array to a lower and higher part
			var middle = (low + high) / 2;

			// sort the lower part
			opCount += mergeSort(array, tmp, low, middle);

			// sort the higher part
			opCount += mergeSort(array, tmp, middle + 1, high);

			// merge the two halves
			opCount += merge(array, tmp, low, middle, high);
		}

		return opCount;
	}

	/**
	 * Merges the values from low to middle and middle to high back into array using
	 * temporary array
	 * 
	 * @param array  the array containing the elements
	 * @param tmp    temporary array
	 * @param low    start index of lower elements
	 * @param middle end index of lower elements, +1 start index of higher elements
	 * @param high   end index of higher elements
	 * @return number of operations used for merge
	 */
	private static int merge(int[] array, int[] tmp, int low, int middle, int high) {

		//System.out.println("merge: " + low + "-" + middle + "-" + high);

		var opCount = 0;
		for (var i = low; i <= high; i++) {
			tmp[i] = array[i];
			opCount++;
		}

		var left = low;
		var right = middle + 1;
		var current = low;

		while (left <= middle && right <= high) {
			if (tmp[left] <= tmp[right]) {
				array[current] = tmp[left];
				left++;
			} else {
				array[current] = tmp[right];
				right++;
			}
			current++;
			opCount++;
		}

		var remaining = middle - left;
		for (var i = 0; i <= remaining; i++) {
			array[current + i] = tmp[left + i];
			opCount++;
		}

		return opCount;
	}
}
