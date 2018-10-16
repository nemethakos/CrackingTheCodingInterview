package Chapter2_Linked_Lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import data.Node;

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
