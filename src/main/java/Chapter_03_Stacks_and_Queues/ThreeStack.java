package Chapter_03_Stacks_and_Queues;

import java.util.Objects;

/**
 * <b>Three in One:</b> Describe how you could use a single array to implement
 * three stacks.
 */
public class ThreeStack<T> {
	private T[] array;
	private int[] stackPointers = new int[3];

	@SuppressWarnings("unchecked")
	public ThreeStack(int stackSize) {
		super();
		this.array = (T[]) new Object[stackSize * 3];
	}

	public T peek(int stack) {
		checkStackNumber(stack);
		checkEmptyStack(stack);
		int stackIndex = getStackIndex(stack) - 3;
		return array[stackIndex];
	}

	public boolean isEmpty(int stack) {
		checkStackNumber(stack);
		return stackPointers[stack] == 0;
	}

	public void push(T item, int stack) {
		checkStackNumber(stack);
		Objects.requireNonNull(item);
		checkFullStack(stack);
		array[getStackIndex(stack)] = item;
		stackPointers[stack]++;
	}

	public T pop(int stack) {
		checkStackNumber(stack);
		checkEmptyStack(stack);
		T result = array[getStackIndex(stack) - 3];
		stackPointers[stack]--;
		return result;
	}

	void checkFullStack(int stack) {
		if (stackPointers[stack] >= array.length / 3) {
			throw new IllegalStateException("Stack " + stack + "is full!");
		}
	}

	void checkStackNumber(int stack) {
		if (stack < 0 || stack > 2) {
			throw new IllegalArgumentException("stack should be >=0 && <3");
		}
	}

	void checkEmptyStack(int stack) {
		if (stackPointers[stack] == 0) {
			throw new IllegalStateException("Stack " + stack + " is empty!");
		}
	}

	int getStackIndex(int stack) {
		int stackIndex = stackPointers[stack] * 3 + stack;
		return stackIndex;
	}

}