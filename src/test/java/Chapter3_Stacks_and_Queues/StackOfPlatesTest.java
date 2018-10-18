package Chapter3_Stacks_and_Queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackOfPlatesTest {

	@Test
	void testPopAt() {
		StackOfPlates stack = new StackOfPlates(1);
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		assertTrue(stack.popAt(5) == 5);
	}

	@Test
	void testPush() {
		StackOfPlates stack = new StackOfPlates(1);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertTrue(stack.pop() == 3);
		assertTrue(stack.pop() == 2);
		assertTrue(stack.pop() == 1);
		assertThrows(IllegalStateException.class, ()->stack.pop());
	}

	@Test
	void testIsEmpty() {
		StackOfPlates stack = new StackOfPlates(10);
		assertTrue(stack.isEmpty());
		stack.push(1);
		assertFalse(stack.isEmpty());
	}

	@Test
	void testPeek() {
		StackOfPlates stack = new StackOfPlates(1);
		stack.push(1);
		assertTrue(stack.peek() == 1);
	}

}
