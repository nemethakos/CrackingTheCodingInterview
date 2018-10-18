package Chapter3_Stacks_and_Queues.Chapter3Question6;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 * <b>Animal Shelter:</b> An animal shelter, which holds only dogs and cats,
 * operates on a strictly "first in, first out" basis. People must adopt either
 * the "oldest" (based on arrival time) of all animals at the shelter, or they
 * can select whether they would prefer a dog or a cat (and will receive the
 * oldest animal of that type). They cannot select which specific animal they
 * would like. Create the data structures to maintain this system and implement
 * operations such as
 * <ul>
 * <li>enqueue,
 * <li>dequeueAny,
 * <li>dequeueDog, and
 * <li>dequeueCat.
 * </ul>
 * You may use the built-in Linked list data structure.
 */
public class AnimalQueue {
	private int order = 0;
	private List<Cat> cats = new LinkedList<>();
	private List<Dog> dogs = new LinkedList<>();

	public void enqueue(Animal animal) {
		animal.setOrder(order++);
		if (animal instanceof Dog) {
			dogs.add((Dog) animal);
		} else {
			cats.add((Cat) animal);
		}
	}

	public Animal dequeueAny() {
		if (dogs.isEmpty() && cats.isEmpty()) {
			throw new IllegalStateException("Both queues are empty!");
		} else if (dogs.isEmpty() && !cats.isEmpty()) {
			return dequeueCat();
		} else if (!dogs.isEmpty() && cats.isEmpty()) {
			return dequeueDog();
		} else {
			Animal older = getOlder(dogs.get(0), cats.get(0));
			if (older instanceof Dog) {
				dogs.remove(0);
			} else {
				cats.remove(0);
			}
			return older;
		}
	}

	private Animal getOlder(Animal a1, Animal a2) {
		if (a1.compareTo(a2)>0) {
			return a1;
		}
		else {
			return a2;
		}
	}

	public Dog dequeueDog() {
		return dogs.remove(0);
	}

	public Cat dequeueCat() {
		return cats.remove(0);
	}
}
