/*  Purpose:	Sorting and searching in an array of integers and string,finding the elapsed time for the methods 
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   09-07-2017
 *
 ******************************************************************************/
package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class SearchSort {
	public static void main(String[] args) {
		System.out.println("enter the number of integers you are going to enter");
		Utility utility = new Utility();
		int input1 = utility.inputInteger();
		int[] arrayofint = new int[input1];
		System.out.println("enter the integers");
		for (int i = 0; i < input1; i++) {
			arrayofint[i] = utility.inputInteger();
		}
		System.out.println("enter the number of strings you are going to enter");
		int input2 = utility.inputInteger();
		String[] arrayofstring = new String[input2];
		System.out.println("enter the strings");
		for (int i = 0; i < input2; i++) {
			arrayofstring[i] = utility.inputString();
		}
  	long start1= System.currentTimeMillis();
  	boolean bool=utility.binarySearchInt(arrayofint,arrayofint[2]);
  	long end1=System.currentTimeMillis();
  	long start2=System.currentTimeMillis();
  	boolean bool=utility.binarysearchString(arrayofstring,arrayofstring[2]);
  	
	
		

	}
}