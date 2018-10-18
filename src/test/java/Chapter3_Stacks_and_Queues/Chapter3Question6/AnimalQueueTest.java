package Chapter3_Stacks_and_Queues.Chapter3Question6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalQueueTest {

	@Test
	void testEnqueue() {
		AnimalQueue animalQueue = new AnimalQueue();
		animalQueue.enqueue(new Dog("First"));
		animalQueue.enqueue(new Cat("Second"));

		assertTrue(animalQueue.dequeueDog().getName().equals("First"));
		assertTrue(animalQueue.dequeueCat().getName().equals("Second"));
	}

	@Test
	void testDequeueAny() {
		AnimalQueue animalQueue = new AnimalQueue();
		animalQueue.enqueue(new Dog("1"));
		animalQueue.enqueue(new Cat("2"));
		animalQueue.enqueue(new Dog("3"));
		animalQueue.enqueue(new Cat("4"));
		animalQueue.enqueue(new Dog("5"));
		animalQueue.enqueue(new Cat("6"));
		animalQueue.enqueue(new Dog("7"));
		animalQueue.enqueue(new Cat("8"));
		animalQueue.enqueue(new Dog("9"));
		animalQueue.enqueue(new Cat("10"));

		assertTrue(animalQueue.dequeueAny().getName().equals("1"));
		assertTrue(animalQueue.dequeueAny().getName().equals("2"));
		assertTrue(animalQueue.dequeueAny().getName().equals("3"));
		assertTrue(animalQueue.dequeueAny().getName().equals("4"));
		assertTrue(animalQueue.dequeueAny().getName().equals("5"));
		assertTrue(animalQueue.dequeueAny().getName().equals("6"));
		assertTrue(animalQueue.dequeueAny().getName().equals("7"));
		assertTrue(animalQueue.dequeueAny().getName().equals("8"));
		assertTrue(animalQueue.dequeueAny().getName().equals("9"));
		assertTrue(animalQueue.dequeueAny().getName().equals("10"));

	}



}
