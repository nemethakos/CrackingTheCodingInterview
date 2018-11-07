package Chapter_10_Sorting_and_Searching;

import static data.util.Utils.swap;

public class InsertionSort {

	/**
	 * Sort the array by insertion sort
	 * 
	 * @param arr the array sorted in-place
	 * @return the number of operations used for sorting
	 */
	public static int sort(int[] array) {
		var opCount = 0;

		var sortedBoundaryIndex = 0;
		
		while (sortedBoundaryIndex < array.length - 1) {
		
			var insertIndex = sortedBoundaryIndex;
			
			while (opCount++ >= 0 && insertIndex >= 0 && array[insertIndex] > array[insertIndex + 1]) {
				
				swap(array, insertIndex, insertIndex + 1);
				insertIndex--;
			
				opCount++;
			}
			sortedBoundaryIndex++;
		}

		return opCount;
	}

}
