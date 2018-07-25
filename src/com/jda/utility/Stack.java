package com.jda.utility;

public class Stack<T extends Comparable<T>> {
	public UnorderedList<T> list = new UnorderedList<T>();

	public void push(T data) {
		list.add(data);
	}

	public T pop() {

		 return list.remove();
	}
	public T peak()
	{
		return list.peak();
	}
	public int size()
	{
		return list.size();
	}
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
}
