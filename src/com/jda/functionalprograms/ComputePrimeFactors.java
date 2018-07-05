/******************************************************************************
 *  
 *  Purpose:Find the  prime factors of a number
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   05-07-2017
 *
 ******************************************************************************/
package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class ComputePrimeFactors {
	public static void main(String[] args) {
		System.out.println("enter the value n");
		Utility utility = new Utility();
		int input = utility.inputInteger();
		utility.printPrimeFactors(input);
		
}
}