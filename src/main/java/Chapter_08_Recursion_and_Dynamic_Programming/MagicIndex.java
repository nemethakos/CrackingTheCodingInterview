package Chapter_08_Recursion_and_Dynamic_Programming;

import java.util.Arrays;

public class MagicIndex {

	/**
	 * <b>Magic Index:</b> A magic index in an array <code>A [0..n-1]</code> is
	 * defined to be an index such that <code>A[i] = i</code>. Given a sorted array
	 * of <b>distinct</b> integers, write a method to find a magic index, if one
	 * exists, in array <code>A</code>.
	 * 
	 * @param arr the array
	 * @return -1 if the index is not found, otherwise returns the index
	 */
	public static int findMagicIndex(int... arr) {
		// null and emptiness test
		if (arr == null || arr.length == 0) {
			return -1;
		}
		return findMagicIndex(arr, 0, arr.length - 1);
	}

	/**
	 * Finds the magic index in the subarray of <code>arr</code> int the interval
	 * <code>[start..end]</code>
	 * 
	 * @param arr   the array
	 * @param start the start index, inclusive
	 * @param end   the end index, inclusive
	 * @return the magix index, if found; -1 otherwise
	 */
	private static int findMagicIndex(int[] arr, int start, int end) {

		if (end < start) {
			// not found
			return -1;
		}

		System.out.println(
				"\r\n" + Arrays.toString(Arrays.copyOfRange(arr, start, end + 1)) + ", [" + start + ":" + end + "]");

		int mid = (start + end) / 2;
		System.out.println("mid index: " + mid + ", mid val: " + arr[mid]);

		if (arr[mid] == mid) {
			System.out.println("Found: " + mid);

			return mid;

			// if the middle value of the array is less than the mid index, the magix index
			// could only be found in the upper half (the lower half's max value is less
			// than its max index
		} else if (arr[mid] < mid) {
			// find in the upper half
			System.out.println("Find in upper half");
			return findMagicIndex(arr, mid + 1, end);
		} else {
			// find in the lower half
			System.out.println("Find in lower half");
			return findMagicIndex(arr, start, mid - 1);
		}
	}

	/**
	 * 
	 * <b>Magic Index:</b> A magic index in an array <code>A [0..n-1]</code> is
	 * defined to be an index such that <code>A[i] = i</code>. Given a sorted array
	 * of <b>non distinct</b> integers, write a method to find a magic index, if one
	 * exists, in array <code>A</code>.
	 * 
	 * @param arr the array
	 * @return -1 if the index is not found, otherwise returns the index
	 */
	public static int findMagicIndexNonDistinctValues(int... arr) {
		return findMagicIndexNonDistinctValues(arr, 0, arr.length - 1);
	}

	/**
	 * Finds the magic index in the subarray of <code>arr</code> in the interval
	 * <code>[start..end]</code> The values are not necessarily distinct.
	 * 
	 * @param arr   the array
	 * @param start the start index, inclusive
	 * @param end   the end index, inclusive
	 * @return the magix index, if found; -1 otherwise
	 */
	private static int findMagicIndexNonDistinctValues(int[] arr, int start, int end) {
		if (end < start) {
			return -1;
		}

		System.out.println(
				"\r\n" + Arrays.toString(Arrays.copyOfRange(arr, start, end + 1)) + ", [" + start + ":" + end + "]");

		var mid = (start + end) / 2;
		System.out.println("mid index: " + mid + ", mid val: " + arr[mid]);

		int midValue = arr[mid];
		if (midValue == mid) {
			System.out.println("Found: " + mid);
			return mid;

		} else if (midValue < mid) {
			System.out.println("Find in upper half");
			// find the next value which is different than arr[mid]
			mid = mid + 1;
			while (mid < end && arr[mid] == midValue) {
				System.out.println("Skipping values: " + arr[mid]);
				mid++;
			}
			return findMagicIndexNonDistinctValues(arr, mid, end);

		} else {
			System.out.println("Find in lower half");
			// decrease mid.
			mid = mid - 1;
			// find the prev value which is different than arr[mid]
			while (mid > start && arr[mid] == midValue) {
				System.out.println("Skipping values: " + arr[mid]);
				mid--;
			}
			return findMagicIndexNonDistinctValues(arr, start, mid);

		}
	}

}
