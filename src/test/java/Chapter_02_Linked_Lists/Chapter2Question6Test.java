package Chapter_02_Linked_Lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import Chapter_02_Linked_Lists.Chapter2Question6;
import data.linkedlist.Node;

class Chapter2Question6Test {

	@Test
	void testIsPalindromeStack() {

		assertTrue(Chapter2Question6.isPalindromeStack(Node.build(1)));
		
		assertTrue(Chapter2Question6.isPalindromeStack(null));
		
		assertTrue(Chapter2Question6.isPalindromeStack(Node.build(1,2,3,2,1)));
	
		assertTrue(Chapter2Question6.isPalindromeStack(Node.build(1,2,3,3,2,1)));
		
		assertFalse(Chapter2Question6.isPalindromeStack(Node.build(1,2,3)));

		assertFalse(Chapter2Question6.isPalindromeStack(Node.build(1,2,3,4)));
		
	}

}
