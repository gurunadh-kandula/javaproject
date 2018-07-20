package com.jda.utility;

import com.jda.utility.Stack;


public class Queue2Stacks<T extends Comparable<T>> {
	public Stack<T> stack1 = new Stack<T>();
	public Stack<T> stack2 = new Stack<T>();
	public int count;
	public void enqueue(T data, String purpose) {
		stack1.push(data);
		count++;
	}

	public T dequeue() {
		
		if (stack1.isEmpty() && stack2.isEmpty())
			return null;
		if (stack2.isEmpty()) {
			int size = stack1.size();
			while (size > 1) {
				stack2.push(stack1.pop());
				size--;
			}

		}
		count--;
		return stack1.pop();
	}
}