/******************************************************************************
 *  
 *  Purpose:see the percentage of gambler wins and loss
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   05-07-2017
 *
 ******************************************************************************/
package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class GamblersWinorLoss {
	public static void main(String[] args) {
		int stake, goal, nooftimes;
		double wins, fails;
		int []fate=new int[2];
		System.out.println("enter the values of stake,goal,nooftimes");
		Utility utility = new Utility();
		stake = utility.inputInteger();
		goal = utility.inputInteger();
		nooftimes = utility.inputInteger();
		fate= utility.gamblersFate(stake, goal, nooftimes);
		wins = (double) fate[0] / (fate[0] + fate[1]) * 100;
		fails = (double) fate[1] / (fate[0] + fate[1]) * 100;
		System.out.println(wins);
		System.out.println(fails);

	}
}
