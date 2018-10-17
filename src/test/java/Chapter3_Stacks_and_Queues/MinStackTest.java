package Chapter3_Stacks_and_Queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

	@Test
	void testMin() {
		MinStack<Integer> stack = new MinStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		assertTrue(stack.min() == 1);
		stack.push(0);
		assertTrue(stack.min() == 0);
		stack.pop();
		assertTrue(stack.min() == 1);
	}

	@Test
	void testGetMin() {
		MinStack<Integer> stack = new MinStack<>();
		assertTrue(stack.getMin(1, 2) == 1);
	}

}
