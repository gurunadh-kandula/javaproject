/******************************************************************************
 *  
 *  Purpose:function finds number of random numbers generated to produce the input n distinct coupon numbers
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   05-07-2017
 *
 ******************************************************************************/
package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class CountingnoofRandomnosused {
	public static void main(String[] args) {
		int noofcoupons;
		System.out.println("enter the number of coupouns in total");
		Utility utility = new Utility();
		noofcoupons = utility.inputInteger();
		System.out.println("enter the number of distinct coupons you are going to enter");
		int ncoupons = utility.inputInteger();
		int[] coupouns = new int[ncoupons];
		System.out.println("enter the n distinct coupon numbers");
		for (int i = 0; i < ncoupons; i++) {
			coupouns[i] = utility.inputInteger();
		}
		int output = utility.countsRandomProcess(coupouns, noofcoupons,ncoupons);
		System.out.println(output + "random numbers generated to produce the N distinct coupoun numbers");
	}
}