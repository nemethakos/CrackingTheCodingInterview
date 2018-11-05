package Chapter_03_Stacks_and_Queues;

import java.util.Stack;

public class Chapter3Question5 {

	/**
	 * <b>Sort Stack:</b> Write a program to sort a stack such that the smallest
	 * items are on the top. You can use an additional temporary stack, but you may
	 * not copy the elements into any other data structure (such as an array). The
	 * stack supports the following operations: push, pop, peek, and is Empty.
	 * 
	 * @param unsorted the {@link Stack} to sort
	 * @return the sorted {@link Stack}
	 */
	public static <T extends Comparable<T>> Stack<T> sortStack(Stack<T> unsorted) {

		Stack<T> sorted = new Stack<>();

		T next = null;

		while (!unsorted.isEmpty()) {

			next = unsorted.pop();
			System.out.println("Next: " + next);

			// remove all elements which are less than next
			while (!sorted.isEmpty() && sorted.peek().compareTo(next) < 0) {
				T sortedTop = sorted.pop();
				unsorted.push(sortedTop);
			}
			// place next on sorted
			sorted.push(next);
			
			System.out.println("Sorted: " + sorted);
			System.out.println("Unsorted: " + unsorted);
			System.out.println("-----");
		}

		return sorted;
	}

}
