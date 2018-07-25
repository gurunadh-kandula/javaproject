package com.jda.DataStructurePrograms;

import java.io.BufferedReader;

import java.io.FileReader;

import com.jda.utility.UnorderedList;
import com.jda.utility.Utility;

public class LinkedList {
	public static void main(String args[]) throws Exception {
		UnorderedList<String> list = new UnorderedList<String>();
		Utility utility = new Utility();
		System.out.println("please enter the string you want to search");
		String search = utility.inputstring();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\1023404\\Desktop\\Strings.txt"));
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] values = line.split(",");
			for (String str : values) {
				list.add(str);
			}
		}
		br.close();

		System.out.println("created linkedlist");
		list.printList();
		list.removeAt(search);

		System.out.println("linkedlist after removing the given string");
		list.printList();

	}
}
