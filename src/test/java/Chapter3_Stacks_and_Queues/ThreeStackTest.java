package Chapter3_Stacks_and_Queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeStackTest {

	@Test
	void testPeek() {
		ThreeStack<Integer> stack = new ThreeStack<>(10);
		stack.push(0, 0);
		stack.push(1, 1);
		stack.push(2, 2);
		assertTrue(stack.peek(0) == 0);
		assertTrue(stack.peek(1) == 1);
		assertTrue(stack.peek(2) == 2);

	}

	@Test
	void testIsEmpty() {
		ThreeStack<Integer> stack = new ThreeStack<>(10);
		assertTrue(stack.isEmpty(0));
		assertTrue(stack.isEmpty(1));
		assertTrue(stack.isEmpty(2));
		stack.push(0, 0);
		stack.push(1, 1);
		stack.push(2, 2);
		assertFalse(stack.isEmpty(0));
		assertFalse(stack.isEmpty(1));
		assertFalse(stack.isEmpty(2));
	}

	@Test
	void testPush() {
		ThreeStack<Integer> stack = new ThreeStack<>(10);
		stack.push(10, 0);
		stack.push(20, 0);
		stack.push(30, 0);
		assertTrue(stack.pop(0) == 30);
		assertTrue(stack.pop(0) == 20);
		assertTrue(stack.pop(0) == 10);

		for (int i = 1; i <= 10; i++) {
			stack.push(i, 0);
		}
		assertThrows(IllegalStateException.class, () -> stack.push(10, 0));

	}

	@Test
	void testPop() {
		ThreeStack<Integer> stack = new ThreeStack<>(10);
		stack.push(10, 0);
		stack.push(20, 0);
		stack.push(30, 0);
		assertTrue(stack.pop(0) == 30);
		assertTrue(stack.pop(0) == 20);
		assertTrue(stack.pop(0) == 10);

		assertThrows(IllegalStateException.class, () -> stack.pop(0));
	}

}
