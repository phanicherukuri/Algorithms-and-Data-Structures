package leetcode;

import java.util.*;

//LC - 232

public class ImplementQueueUsingStacks {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.push(1);
		queue.push(2);  
		System.out.println(queue.peek());  // returns 1
		System.out.println(queue.pop());   // returns 1
		System.out.println(queue.empty()); // returns false
	}

}

class MyQueue {

	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

	/** Initialize your data structure here. */
	public MyQueue() {

	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		stack1.push(x);
	}

	/* Removes the element from in front of queue and returns that element. */
	public int pop() {
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}

		int poppedElement = stack2.pop();

		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}

		return poppedElement;
	}

	/** Get the front element. */
	public int peek() {
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}

		int peekElement = stack2.peek();

		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}

		return peekElement;
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		if(!stack1.isEmpty())
			return false;
		return true;
			
	}
}