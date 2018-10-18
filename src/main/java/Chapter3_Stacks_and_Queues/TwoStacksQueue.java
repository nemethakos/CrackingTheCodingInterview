package Chapter3_Stacks_and_Queues;

import java.util.Stack;

/**
 * Queue via Stacks: Implement a MyQueue class which implements a queue using
 * two stacks.
 */
public class TwoStacksQueue<T> {

	Stack<T> stack = new Stack<>();
	
	
	public void add(T item) {
		stack.add(item);
	}

	public T remove() {
		Stack<T> tmp = new Stack<>();
		while (!stack.empty()) {
			tmp.push(stack.pop());
		}
		
		T last = tmp.pop();
		
		while (!tmp.empty()) {
			stack.push(tmp.pop());
		}
		
		return last;
		
	}

	public T peek() {
		Stack<T> tmp = new Stack<>();
		while (!stack.empty()) {
			tmp.push(stack.pop());
		}
		
		T last = tmp.peek();
		
		while (!tmp.empty()) {
			stack.push(tmp.pop());
		}
		
		return last;
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

}
