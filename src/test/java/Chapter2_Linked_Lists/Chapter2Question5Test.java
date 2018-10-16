package Chapter2_Linked_Lists;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

import Util.Utils;
import data.Node;

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
