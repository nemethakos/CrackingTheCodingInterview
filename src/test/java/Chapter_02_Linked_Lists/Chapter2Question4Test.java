package Chapter_02_Linked_Lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import Chapter_02_Linked_Lists.Chapter2Question4;
import data.linkedlist.Node;
import util.Utils;

class Chapter2Question4Test {

	/**
	 * Note: the expected linked list could be different, a different comparison
	 * would be better accomodated to this exact question
	 */
	@Test
	void testPartition() {
		Node list = Node.build(3);
		list.add(5).add(8).add(5).add(10).add(2).add(1);

		Node partitionedResult = Node.build(3);
		partitionedResult.add(2).add(1).add(5).add(8).add(5).add(10);

		Node partitioned = Chapter2Question4.partition(list, 5);

		System.out.println("Expected result: " + partitionedResult);
		System.out.println("Actual result:   " + partitioned);

		assertTrue(Utils.equalLinkedList(partitioned, partitionedResult));
	}

}
