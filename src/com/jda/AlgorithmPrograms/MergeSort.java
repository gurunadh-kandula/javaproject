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
		System.out.println("please enter the no.of strings u want to enter");
	int input = utility.inputInteger();
	String[] stringarray = new String[input];
	System.out.println("please enter the strings");
	for (int i = 0; i < input; i++) {
		stringarray[i] = utility.inputstring();

	}
			utility.mergeSort(stringarray,0,input-1);
			
		utility.printArray(stringarray);
		
}
}
	
