/******************************************************************************
 *  
 *  Purpose:guess the number
 *  
 *
 *@author  gurunadh
 *  @version 1.0
 *  @since   11-07-2017
 *
 ******************************************************************************/
package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class GuessNumber {
	public static void main(String[] args) {
		int N=Integer.parseInt(args[0]);
		int n=(int)(Math.log(N)/Math.log(2));
		Utility utility=new Utility();
		System.out.println("please enter yes or no acoordingly");
		utility.guessNumber(n,0, N-1);
		
	}
}
