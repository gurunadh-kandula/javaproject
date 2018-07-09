/******************************************************************************
 *   
 *  Purpose:Finding the value of windchill
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   09-07-2017
 *
 ******************************************************************************/
package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class WindChill {
	public static void main(String args[]) {
		double t, v;
		double windchill;

		Utility utility = new Utility();
		System.out.println("enter value of  temperature  t (in fahrenheit )and windspeed v(in milesperhour)");
		t = utility.inputdouble();
		v = utility.inputdouble();
		if (Math.abs(t) > 50)
			System.out.println("not a valid temperature,pls enter value less than 50");
		else {
			if (v < 3 || v > 120)
				System.out.println("not a  valid wind speed,pls enter value greater than 3 and less than or equal to 120");
			else {
				windchill = utility.windChill(t, v);
				System.out.println("Winchill value is" + windchill);
			}
		}
	}
}
