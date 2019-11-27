package leetcode;

import java.util.*;

//LC - 225

public class ImplementStackUsingQueues {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);  
		System.out.println(stack.top());   // returns 2
		System.out.println(stack.pop());   // returns 2
		System.out.println(stack.empty()); // returns false
	}

}

class MyStack {

	Queue<Integer> queue1 = new LinkedList<>();
	Queue<Integer> queue2 = new LinkedList<>();

	public MyStack() {

	}

	/** Push element x onto stack. */
	public void push(int x) {
		queue1.add(x);
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		int poppedElement = -1;
		
		int queueSize = queue1.size();
		for(int i = 0;i<queueSize; i++) {
			if(i == queueSize-1)
				poppedElement = queue1.poll();
			else {
				queue2.add(queue1.poll());
			}
		}
		
		while (!queue2.isEmpty()) {
			queue1.add(queue2.poll());
		}
		
		return poppedElement;
	}

	/** Get the top element. */
	public int top() {
		int topElement = -1;
		while (!queue1.isEmpty()) {
			topElement = queue1.peek();
			queue2.add(queue1.poll());
		}
		while (!queue2.isEmpty()) {
			queue1.add(queue2.poll());
		}
		return topElement;
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		if(!queue1.isEmpty())
			return false;
		return true;
	}
}
