package com.jda.DataStructurePrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import com.jda.utility.OrderedList;
import com.jda.utility.Utility;

public class OrderedListintegers {
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
			System.out.print(arr[i] + "  ");
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
