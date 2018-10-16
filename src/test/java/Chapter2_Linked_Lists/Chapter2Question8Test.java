package Chapter2_Linked_Lists;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

import Util.Utils;
import data.Node;

class Chapter2Question8Test {

	@Test
	void testLoopDetection() {
		Node list1 = Node.build(1, 2, 99, 98, 97, 96);
		Node list2 = Node.build(3);
		Node list3 = Node.build(4, 5, 6, 7, 10, 11, 12);

		Utils.tail(list1).setNext(list2);
		Utils.tail(list1).setNext(list3);
		Utils.tail(list3).setNext(list2);

		// loop at the node with value 3
		assertTrue(Chapter2Question8.loopDetection(list1).getValue() == 3);

		// no loop
		assertTrue(Chapter2Question8.loopDetection(Node.build(1,2,3)) == null);
	}

}
