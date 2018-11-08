package Chapter_10_Sorting_and_Searching;

import java.util.concurrent.atomic.AtomicInteger;

import static data.util.Utils.swap;

public class QuickSort {

	/**
	 * Entry method for quick sort
	 * 
	 * @param array the array to sort in-place
	 * @return number of operations performed during sorting
	 */
	public static int sort(int[] array) {
		return quickSort(array, 0, array.length - 1);
	}

	/**
	 * Recursive quick sort implementation
	 * 
	 * @param array     the array to sort
	 * @param lowIndex  start index
	 * @param highIndex end index
	 * @return number of operations performed during sorting
	 */
	private static int quickSort(int[] array, int lowIndex, int highIndex) {
		var numOps = 1;
		if (lowIndex < highIndex) {
			AtomicInteger partitionOps = new AtomicInteger();
			var pivotIndex = partition(array, lowIndex, highIndex, partitionOps);
			numOps += partitionOps.get();
			numOps += quickSort(array, lowIndex, pivotIndex - 1);
			numOps += quickSort(array, pivotIndex + 1, highIndex);
		}
		return numOps;
	}

	/**
	 * Lomuto partition scheme
	 * 
	 * @param array  the array to partition
	 * @param low    start index
	 * @param high   end index
	 * @param numOps the number of operations performed during partition
	 */
	private static int partition(int array[], int low, int high, AtomicInteger numOps) {
		int pivotValue = array[high];
		int pivotIndex = low - 1;

		for (var runningIndex = low; runningIndex <= high - 1; runningIndex++) {
			if (array[runningIndex] < pivotValue) {
				if (pivotIndex != runningIndex) {
					pivotIndex++;
					swap(array, pivotIndex, runningIndex);
					numOps.incrementAndGet();
				}
			}
		}
		pivotIndex++;
		swap(array, pivotIndex, high);
		numOps.incrementAndGet();
		return pivotIndex;
	}

}
