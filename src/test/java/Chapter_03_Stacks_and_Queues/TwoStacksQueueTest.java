package Chapter_03_Stacks_and_Queues;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import Chapter_03_Stacks_and_Queues.TwoStacksQueue;

class TwoStacksQueueTest {

	@Test
	void testAdd() {
		TwoStacksQueue<Integer> q = new TwoStacksQueue<>();
		q.add(1);
		q.add(2);
		q.add(3);

		assertTrue(q.remove() == 1);
		assertTrue(q.remove() == 2);
		assertTrue(q.remove() == 3);
	}

	@Test
	void testPeek() {
		TwoStacksQueue<Integer> q = new TwoStacksQueue<>();
		q.add(1);
		q.add(2);
		q.add(3);

		assertTrue(q.peek() == 1);
	}

	@Test
	void testIsEmpty() {
		TwoStacksQueue<Integer> q = new TwoStacksQueue<>();
		assertTrue(q.isEmpty());
		
		q.add(1);

		assertFalse(q.isEmpty());
		
		q.remove();
		
		assertTrue(q.isEmpty());

	}

}
