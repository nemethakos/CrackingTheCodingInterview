package Chapter2_Linked_Lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import Util.Utils;
import data.Node;

class Chapter2Question7Test {

	@Test
	void testGetIntersectingNode() {
		Node list1 = Node.build(1, 2);
		Node list2 = Node.build(5, 6, 7, 8);
		Node list3 = Node.build(3, 4);

		list1.tail().setNext(list3);
		list2.tail().setNext(list3);

		assertTrue(Chapter2Question7.getIntersectingNode(list1, list2).equals(list3));

		assertTrue(Chapter2Question7.getIntersectingNode(null, null) == null);

		assertTrue(Chapter2Question7.getIntersectingNode(Node.build(1), Node.build(2)) == null);

		assertTrue(Chapter2Question7.getIntersectingNode(Node.build(1, 2, 3, 4), Node.build(5, 6, 7, 8)) == null);

		assertTrue(Chapter2Question7.getIntersectingNode(Node.build(1, 2, 3, 4, 5, 6), Node.build(5, 6, 7, 8)) == null);

	}

}
