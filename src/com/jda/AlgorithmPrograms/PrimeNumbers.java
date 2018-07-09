/*  Purpose:	Printing prime numbers below the given number
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   09-07-2017
 *
 ******************************************************************************/
package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class PrimeNumbers {
	public static void main(String[] args) {
		System.out.println("enter the number below which u want to find prime numbers");
		Utility utility = new Utility();
		int input = utility.inputInteger();
		utility.printPrimes(input);
		
}
}
