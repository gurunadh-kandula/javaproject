package com.jda.DataStructurePrograms;

import java.util.ArrayList;

import com.jda.utility.Queue;

import com.jda.utility.Utility;



public class PrimeAnagramQueue {
	public static void main(String args[]) {
		
		Utility utility = new Utility();
		ArrayList<Integer> array = utility.Primesret(1000);
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		
		Queue<Integer> queue = new Queue<Integer>();
		for (int i = 0; i < array.size(); i++) {
			for (int j = i + 1; j < array.size(); j++) {
				boolean bool = utility.checkAnagram(Integer.toString(array.get(i)), Integer.toString(array.get(j)));
				if (bool) {
					array1.add(array.get(i));
					array1.add(array.get(j));
				}
			}
		}
		 Integer[] intarray = new Integer[array1.size()];
	        intarray = array1.toArray(intarray);
	        
		for (int i = 0; i < array1.size(); i++) {
			queue.enqueue(intarray[i]);

		}
		for (int i = 0; i < array1.size(); i++) {
			System.out.println(queue.dequeue().value);

		}
	}

}
