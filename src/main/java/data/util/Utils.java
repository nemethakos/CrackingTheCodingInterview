package data.util;

public class Utils {
	/**
	 * Swaps index1th and index2th elements in the array
	 * 
	 * @param array  the int array
	 * @param index1 the first index
	 * @param index2 the second index
	 */
	public static void swap(int[] array, int index1, int index2) {
		int tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;

	}
}
