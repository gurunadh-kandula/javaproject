/******************************************************************************
 *  
 *  Purpose:Finds the permutations of the input string
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   06-07-2017
 *
 ******************************************************************************/
package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class PermutationsOfaString {
	public static void main(String[] args) {
		String input;
		Utility utility = new Utility();
		System.out.println("enter your string to get its permutations");
		input = utility.inputString();
		int inputlength = input.length();
		utility.permutationsOfStringUsingRecursion(input, 0, (inputlength - 1));
		
	}
}
