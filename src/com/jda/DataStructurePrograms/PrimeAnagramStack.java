package com.jda.DataStructurePrograms;

import java.util.ArrayList;
import java.util.Arrays;

import com.jda.utility.Stack;
import com.jda.utility.Utility;

public class PrimeAnagramStack {

	public static void main(String args[]) {
		int row = 0;
		int coloumn = 0;

		Utility utility = new Utility();
		ArrayList<Integer> array = utility.Primesret(1000);
		ArrayList<Integer> array1 = utility.Primesret(1000);
		String[][] primeanagram = new String[80][2];
		Stack<Integer> stack = new Stack<Integer>();
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
			stack.push(intarray[i]);

		}
		for (int i = 0; i < array1.size(); i++) {
			System.out.println(stack.pop());

		}
	}
}
