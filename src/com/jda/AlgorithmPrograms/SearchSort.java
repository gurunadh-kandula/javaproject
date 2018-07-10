/*  Purpose:	Printing prime numbers below the given number
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   10-07-2017
 *
 ******************************************************************************/
package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class SearchSort {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("please enter then number of integers u want to enter");
		int input=utility.inputInteger();
		int[]integerarray=new int[input];
		System.out.println("please enter the integers");
		for(int i=0;i<input;i++)
		{
			integerarray[i]=utility.inputInteger();
		}
		System.out.println("please enter the no.of strings u want to enter");
		input=utility.inputInteger();
		String[]stringarray=new String[input];
		System.out.println("please enter the strings");
		for(int i=0;i<input;i++)
		{
			stringarray[i]=utility.inputString();
		}
		

}
}
