package com.jda.ObjectOrientedPrograms;

import java.util.ArrayList;
import java.util.Collections;

import com.jda.utility.Queue;
import com.jda.utility.Queue.Qnode;

public class Player {

	Queue<String> queue;
	ArrayList<String> list = new ArrayList<String>();

	Player() {
		queue = new Queue<String>();
	}

	public void SortCards() {
		for (int i = 0; i < 9; i++) {
			Qnode<String> temp = queue.dequeue();
			list.add((String) temp.value);

		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {

			queue.enqueue(list.get(i));
		}

	}

	public Queue<String> getqueue() {

		return queue;
	}

	public void printQueue() {
		for (int i = 0; i < 9; i++) {
			Qnode<String> temp = queue.dequeue();
			System.out.println(temp.value);

		}

	}

}
