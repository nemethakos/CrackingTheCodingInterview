package Chapter3_Stacks_and_Queues;

import java.util.Stack;

@SuppressWarnings("serial")
public class MinStack<T extends Comparable<T>> extends Stack<T> {
	
	Stack<T> minStack = new Stack<>();

	public T min() {
		return minStack.peek();
	}
	
	@Override
	public T push(T item) {
		T push = super.push(item);
		if (minStack.isEmpty()) {
			minStack.push(item);
		}
		else {
			T min = getMin(minStack.peek(), item);
			minStack.push(min);
		}
		return push;
	}

	@Override
	public synchronized T pop() {
		T pop = super.pop();
		minStack.pop();
		return pop;
	}
	
	T getMin(T a, T b) {
		
		if (a.compareTo(b) > 0) {
			return b;
		}
		else {
			return a;
		}
	}

}
