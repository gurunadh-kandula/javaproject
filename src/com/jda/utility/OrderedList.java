package com.jda.utility;



public class OrderedList<T extends Comparable<T>> {

	public Node<T> head = null;

	public class Node<S> {
		public S value;
		public Node<S> next;

		Node(S data) {
			value = data;
			next = null;
		}
	}
	public void orderedAdd(T key) {
		Node<T> temp = head;
		Node<T> prev = null;

		while (temp != null && (key).compareTo(temp.value) <= 0) {
		prev = temp;
		temp = temp.next;
		}

		if (temp == head)
		add(key);
		else {
		if (temp == null) {
		Node<T> newnode = new Node<T>(key);
		prev.next = newnode;
		newnode.next = null;
		} 
		else {
		Node<T> newnode = new Node<T>(key);
		newnode.next = temp;
		prev.next = newnode;
		}
		}
		}
	public void removeAt(T key) {
		Node<T> temp = head;
		Node<T> prev = null;

		if (temp != null && ((temp.value).compareTo(key) == 0)) {
			head = temp.next;
			return;
		}
		while (temp != null && ((temp.value).compareTo(key) != 0)) {
			prev = temp;
			temp = temp.next;

		}
		if (temp == null)
			addAt(key);
		else
			prev.next = temp.next;

	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	public int size() {
		int count = 0;
		Node<T> temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	public T peak() {
		return head.value;
	}

	public void add(T data) {
		Node<T> newnode = new Node<T>(data);
		newnode.next = head;
		head = newnode;
	}

	public void addAt(T data) {
		Node<T> newnode = new Node<T>(data);
		Node<T> temp = head;
		Node<T> prev = null;
		while (temp != null && ((temp.value).compareTo(data) >= 0)) {
			prev = temp;
			temp = temp.next;

		}
		if (temp == null) {
			prev.next = newnode;
			newnode.next = null;
		} else {
			if (temp == head) {
				newnode.next = temp;
				head = newnode;
			} else {
				newnode.next = temp;
				prev.next = newnode;
			}
		}
	}

	public void printList() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.value + "  ");
			temp = temp.next;
		}
		System.out.println();
	}
}