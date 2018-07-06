/******************************************************************************
 *   
 *  Purpose:Finding triplets that makes sum as zero
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   06-07-2017
 *
 ******************************************************************************/
package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class FindingTriplets {
	public static void main(String args[])
	{ int numbers;

	System.out.println("enter the number of integers (+ve&-ve) you are going to enter");
	Utility utility = new Utility();
	numbers= utility.inputInteger();
	int[]numberarray=new int[numbers];
	System.out.println("enter the array numbers");
	for (int i = 0; i < numbers; i++) {
		numberarray[i] = utility.inputInteger();
 }
	 utility.	findingTriplets(numberarray);
}
}
