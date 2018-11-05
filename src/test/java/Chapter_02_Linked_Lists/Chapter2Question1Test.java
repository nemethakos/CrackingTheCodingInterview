package Chapter_02_Linked_Lists;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import Chapter_02_Linked_Lists.Chapter2Question1;
import data.linkedlist.Node;
import util.Utils;

class Chapter2Question1Test {

	@Test
	void testEqualLinkedList() {
		Node node = Node.build(1);
		node.add(2).add(1).add(2).add(3);

		Node n2 = Node.build(1);
		n2.add(2).add(1).add(2).add(3);

		Node n3 = Node.build(1);

		assertTrue(Utils.equalLinkedList(node, n2));

		assertFalse(Utils.equalLinkedList(node, n3));
	}

	@Test
	void testRemoveDuplicates() {
		Node withDuplicates = Node.build(1);
		withDuplicates.add(2).add(1).add(2).add(3);

		Node withoutDuplicates = Node.build(1);
		withoutDuplicates.add(2).add(3);

		Node removeDuplicatesResult = Chapter2Question1.removeDuplicates(withDuplicates);
		
		assertTrue(Utils.equalLinkedList(removeDuplicatesResult, withoutDuplicates));

	}

	@Test
	void testRemoveDuplicatesWithoutTemporaryBuffer() {
		Node withDuplicates = Node.build(1);
		withDuplicates.add(2).add(1).add(2).add(3);

		Node withoutDuplicates = Node.build(1);
		withoutDuplicates.add(2).add(3);

		Node removeDuplicatesResult = Chapter2Question1.removeDuplicatesWithoutTemporaryBuffer(withDuplicates);
		
		assertTrue(Utils.equalLinkedList(removeDuplicatesResult, withoutDuplicates));

	}

}
