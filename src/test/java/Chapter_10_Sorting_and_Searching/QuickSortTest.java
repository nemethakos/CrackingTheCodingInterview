package Chapter_10_Sorting_and_Searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import util.Utils;

class QuickSortTest {

	@Test
	void testQuickSort() {
		var arr = Utils.getArrayToSort(100);
		System.out.println(Utils.arrayToString("Unsorted", arr));

		var opCount = QuickSort.sort(arr);
		System.out.println(Utils.arrayToString("Quick sorted(" + opCount +")", arr));

		assertTrue(Utils.isSorted(arr));
	}

}
