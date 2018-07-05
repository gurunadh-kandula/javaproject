/******************************************************************************
 *  
 *  Purpose:flip the coin and find the heads and tails percentage
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   04-07-2017
 *
 ******************************************************************************/
package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Headandtails {
	public static void main(String[] args) {
		double heads, tails;
		int input;
		int[] coins = new int[2];
		System.out.println("enter the no.of times you want to flip the coin");
		Utility utility = new Utility();
		input = utility.inputInteger();
		coins = utility.headnTails(input);
		tails = (double)coins[0]/(coins[0]+coins[1])*100;
		heads = (double)coins[1]/(coins[0]+coins[1])*100;
		System.out.println(heads);
		System.out.println(tails);

	}

}
