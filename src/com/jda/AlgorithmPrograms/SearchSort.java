/******************************************************************************
 *  
 *  Purpose:Seraching and sorting using genrics
 *  
 *
 *@author  gurunadh
 *  @version 1.0
 *  @since   05-07-2017
 *
 ******************************************************************************/
package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class SearchSort {
	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("please enter the number of integers u want to enter");
		int input = utility.inputInteger();
		Integer[] integerarray = new Integer[input];
		System.out.println("please enter the integers");
		for (int i = 0; i < input; i++) {
			integerarray[i] = utility.inputInteger();
		}
		System.out.println("please enter the no.of strings u want to enter");
		int input1 = utility.inputInteger();
		String[] stringarray = new String[input];
		System.out.println("please enter the strings");
		for (int i = 0; i < input1; i++) {
			stringarray[i] = utility.inputstring();

		}
		System.out.println("using generic bubble sort");
		Utility.genericBubbleSort(integerarray, input);
		Utility.genericBubbleSort(stringarray, input1);
		System.out.println("using generic insertion sort");
		integerarray = Utility.genericInsertionSort(integerarray, input);
		stringarray = Utility.genericInsertionSort(stringarray, input1);
		System.out.println("enter integer element u want to search");
		Integer value = utility.inputInteger();
		boolean bool = Utility.genericBinarySearch(integerarray, value, 0, input - 1);
		System.out.println(bool);
		System.out.println("enter the string element u want to search");
		String str = utility.inputstring();
		bool = Utility.genericBinarySearch(stringarray, str, 0, input1);
		System.out.println(bool);
	}
}
