package Chapter3_Stacks_and_Queues;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class Chapter3Question5Test {

	@Test
	void testSortStack() {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(20);
		stack.push(3);
		stack.push(40);
		stack.push(5);
		stack.push(60);
		stack.push(7);
		stack.push(80);
		stack.push(9);
		stack.push(100);
		//System.out.println("Unsorted stack: " + stack);

		var sorted = Chapter3Question5.sortStack(stack);

		System.out.println("Sorted: " + sorted);

	}

}
