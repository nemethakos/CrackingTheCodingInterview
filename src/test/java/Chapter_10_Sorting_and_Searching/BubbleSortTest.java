package Chapter_10_Sorting_and_Searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import util.Utils;

class BubbleSortTest {

	@Test
	void testSort() {
		var arr = Utils.getArrayToSort(100);
		System.out.println(Utils.arrayToString("Unsorted", arr));

		var opCount = BubbleSort.sort(arr);
		System.out.println(Utils.arrayToString("Bubble sorted(" + opCount +")", arr));

		assertTrue(Utils.isSorted(arr));
	}

}
