package Chapter_10_Sorting_and_Searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import util.Utils;

class BinarySearchTest {

	@Test
	void testSearch() {
		var arr = Utils.getArrayToSort(100, 0, 1);
		for (var i = 0; i < arr.length; i++) {
			var index = BinarySearch.search(arr, i);
			assertEquals(i, index);
		}
		
		for (var i = 0; i < arr.length; i++) {
			var index = BinarySearch.searchRecursive(arr, i, 0, arr.length);
			assertEquals(i, index);
		}
	}

}
