package Chapter2_Linked_Lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import data.Node;

class Chapter2Question2Test {

	@Test
	void testGetKthToLast() {
		Node list = Node.build(5);
		list.add(4).add(3).add(2).add(1).add(0);
		
		assertEquals(3, Chapter2Question2.getKthToLast(list, 3).getValue());
		
		assertEquals(null, Chapter2Question2.getKthToLast(list, 6));
		
		assertEquals(0, Chapter2Question2.getKthToLast(list, 0).getValue());

	}

}
