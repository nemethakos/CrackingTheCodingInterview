package Chapter_10_Sorting_and_Searching;

import java.util.LinkedHashMap;

import org.junit.jupiter.api.Test;

import util.Utils;

public class SortTest {

	private static final int NUM_ELEMENTS = 10000;

	@Test
	void testSort() {

		var map = new LinkedHashMap<String, Integer>();

		System.out.println("Number of elements to sort: " + NUM_ELEMENTS);

		// bubble
		{
			var best = Utils.getArrayToSort(NUM_ELEMENTS, 0, 1);
			// System.out.println(Utils.arrayToString("best", best));

			var worst = Utils.getArrayToSort(NUM_ELEMENTS, NUM_ELEMENTS, -1);
			// System.out.println(Utils.arrayToString("worst", worst));

			map.put("bubble-best", BubbleSort.sort(best));
			map.put("bubble-worst", BubbleSort.sort(worst));
		}

		// insertion
		{
			var best = Utils.getArrayToSort(NUM_ELEMENTS, 0, 1);
			var worst = Utils.getArrayToSort(NUM_ELEMENTS, NUM_ELEMENTS, -1);

			map.put("insertion-best", InsertionSort.sort(best));
			map.put("insertion-worst", InsertionSort.sort(worst));
		}

		// selection
		{
			var best = Utils.getArrayToSort(NUM_ELEMENTS, 0, 1);
			var worst = Utils.getArrayToSort(NUM_ELEMENTS, NUM_ELEMENTS, -1);

			map.put("selection-best", SelectionSort.sort(best));
			map.put("selection-worst", SelectionSort.sort(worst));
		}

		// merge
		{
			var best = Utils.getArrayToSort(NUM_ELEMENTS, 0, 1);
			var worst = Utils.getArrayToSort(NUM_ELEMENTS, NUM_ELEMENTS, -1);

			map.put("merge-best", MergeSort.sort(best));
			map.put("merge-worst", MergeSort.sort(worst));
		}

		map.entrySet().stream().forEach(entry -> {

			var line = String.format("%s: %,d", entry.getKey(), entry.getValue());
			System.out.println(line);
		});

	}
}
