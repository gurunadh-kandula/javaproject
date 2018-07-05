/******************************************************************************
 *  
 *  Purpose:To find a year is leap year or not
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   04-07-2017
 *
 ******************************************************************************/
package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("enter the year to check its a leap year or not");
		Utility utility = new Utility();
		int input = utility.inputInteger();
		int count = 0;
		while (input != 0) {
			input = input / 10;
			count++;
		}
		if (count != 4)
			System.out.println("not a year ..pls enter 4 digit number");
		else {
			Boolean leap = utility.leapYear(input);
			if (leap ==true)
				System.out.println("Its a leap year");
			else
				System.out.println("Its not a  leap year");
		}
	}
}
