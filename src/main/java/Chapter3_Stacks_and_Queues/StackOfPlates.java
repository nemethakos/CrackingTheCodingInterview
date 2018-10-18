package Chapter3_Stacks_and_Queues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <p>
 * <b>Stack of Plates:</b> Imagine a (literal) stack of plates. If the stack
 * gets too high, it might topple. Therefore, in real life, we would likely
 * start a new stack when the previous stack exceeds some threshold. Implement a
 * data structure {@code SetOfStacks} that mimics this. SetO-fStacks should be
 * composed of several stacks and should create a new stack once the previous
 * one exceeds capacity. {@code SetOfStacks.push()} and
 * {@code SetOfStacks.pop()} should behave identically to a single stack (that
 * is, {@code pop()} should return the same values as it would if there were
 * just a single stack).
 * <p>
 * FOLLOW UP
 * <p>
 * Implement a function {@code popAt(int index)} which performs a pop operation
 * on a specific sub-stack.
 */
public class StackOfPlates {

	private List<Stack<Integer>> listOfStacks = new ArrayList<>();
	private int maxStackSize;

	public StackOfPlates(int maxStackSize) {
		this.maxStackSize = maxStackSize;
	}
	
	public int popAt(int stackNumber) {
		if (stackNumber < 0 || stackNumber > listOfStacks.size() - 1) {
			String validStackNumbers;
			if (getLastStack() == null) {
				validStackNumbers = "No stack!";
			} else {
				validStackNumbers = "[0, " + (listOfStacks.size() - 1) + "]";
			}
			throw new IllegalArgumentException(
					"Illegal stack number: " + stackNumber + ", valid stack numbers: " + validStackNumbers);
		}

		int value = listOfStacks.get(stackNumber).pop();

		if (listOfStacks.get(stackNumber).size() == 0) {
			listOfStacks.remove(stackNumber);
		}

		return value;
	}

	public void push(int value) {
		if (listOfStacks.size() == 0 || getLastStack().size() == maxStackSize) {
			listOfStacks.add(new Stack<Integer>());
		}
		getLastStack().add(value);
	}

	private Stack<Integer> getLastStack() {
		if (listOfStacks.size() == 0) {
			return null;
		} else {
			return listOfStacks.get(listOfStacks.size() - 1);
		}
	}

	public int pop() {
		checkEmptyStack();
		int value = getLastStack().pop();
		if (getLastStack().isEmpty()) {
			listOfStacks.remove(getLastStack());
		}

		return value;
	}

	private void checkEmptyStack() {
		if (getLastStack() == null) {
			throw new IllegalStateException("Empty stack!");
		}
	}

	public boolean isEmpty() {
		return getLastStack() == null;
	}

	public int peek() {
		checkEmptyStack();
		return getLastStack().peek();
	};

}
