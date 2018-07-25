package com.jda.utility;

public class Deque<T extends Comparable<T>> {
	public Dqnode<T> front = null;
	public Dqnode<T> rear = null;
	public int size;

	public static class Dqnode<S> {
		public S value;
		public Dqnode<S> next;
		public Dqnode<S> prev;

		Dqnode(S data) {
			value = data;
			next = null;
			prev = null;
		}
	}

	public Deque() {
		rear = front = null;
	}

	public void insertEnd(T data) {
		Dqnode<T> newnode = new Dqnode<T>(data);
		if (rear == null) {
			rear = front = newnode;
			return;
		}
		newnode.prev = rear;
		rear.next = newnode;
		rear = newnode;
		size++;
	}

	public void insertFront(T data) {
		Dqnode<T> newnode = new Dqnode<T>(data);
		if (front == null) {
			rear = front = newnode;
			return;
		}
		newnode.next = front;
		front.prev = newnode;
		front = newnode;
		size++;
	}

	public Dqnode<T> deleteFront() {
		if (front == null)
			return null;
		Dqnode<T> temp = front;
		front = front.next;
		if (front == null)
			rear = null;
		else
			front.prev = null;
		size--;
		return temp;

	}

	public Dqnode<T> deleteEnd() {
		if (front == null)
			return null;
		Dqnode<T> temp = rear;
		rear = rear.prev;
		if (rear == null)
			front = null;
		else
			rear.next = null;
		size--;
		return temp;
	}
}
