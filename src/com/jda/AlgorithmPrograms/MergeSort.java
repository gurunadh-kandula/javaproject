/******************************************************************************
 *  
 *  Purpose:MeregSort
 *  
 *
 *@author  gurunadh
 *  @version 1.0
 *  @since   11-07-2017
 *
 ******************************************************************************/
package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class MergeSort {
	public static void main(String[] args) {

		Utility utility = new Utility();
		/*System.out.println("please enter the no.of strings u want to enter");
	int input1 = utility.inputInteger();*/
		String[] stringarray ={"guru","abc","jfg"};
		/*
		System.out.println("please enter the strings");
		for (int i = 0; i < input1; i++) {
			stringarray[i] = utility.inputString();
		}
			utility.mergeSort(stringarray,0,input1-1);*/
				utility.mergeSort(stringarray,0,2);
		utility.printArray(stringarray);
		
}
}
	
