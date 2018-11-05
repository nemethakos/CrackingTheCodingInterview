package Chapter_02_Linked_Lists;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

import Chapter_02_Linked_Lists.Chapter2Question5;
import data.linkedlist.Node;
import util.Utils;

class Chapter2Question5Test {

	@Test
	void testSumLists() {

		Node num1 = Node.build(7, 1, 6);
		Node num2 = Node.build(5, 9, 2);

		Node sum = Chapter2Question5.sumLists(num1, num2);
		
		System.out.println(sum);

		assertTrue(Utils.equalLinkedList(sum, Node.build(2, 1, 9)));
	}

}
