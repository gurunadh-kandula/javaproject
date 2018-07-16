package com.jda.DataStructurePrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import com.jda.utility.Utility;

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

	void removeAt(T key) {
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

	void add(T data) {
		Node<T> newnode = new Node<T>(data);
		newnode.next = head;
		head = newnode;
	}

	void addAt(T data) {
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

	void printList() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.value + "  ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[]) throws Exception {
		OrderedList<Integer> list = new OrderedList<Integer>();
		ArrayList<Integer> templist = new ArrayList<Integer>();
		Utility utility = new Utility();
		System.out.println("please enter the integer you want to search");
		int search = utility.inputInteger();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\1023404\\Desktop\\Integer.txt"));
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] values = line.split(",");
			for (String str : values) {
				templist.add(Integer.parseInt(str));
			}
		}
		br.close();
		Integer[] arr = new Integer[templist.size()];
		System.out.println("Integers read from the file");
		arr = templist.toArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println("created linkedlist");
		list.printList();
		list.removeAt(search);

		System.out.println("linkedlist after removing the given string");
		list.printList();

	}
}
