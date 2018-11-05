package Chapter_02_Linked_Lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Chapter_02_Linked_Lists.Chapter2Question3;
import data.linkedlist.Node;

class Chapter2Question3Test {

	@Test
	void testDeleteMiddleNode() {
		Node list = Node.build(1);
		list.add(2).add(3).add(4).add(1).add(5);
		
		assertEquals(2, Chapter2Question3.deleteMiddleNode(list).getValue());
	}

}
