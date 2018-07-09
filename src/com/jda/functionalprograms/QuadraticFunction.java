/******************************************************************************
 *   
 *  Purpose:Finding the roots of a quadratic function
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   09-07-2017
 *
 ******************************************************************************/
package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class QuadraticFunction {
	public static void main(String args[]) {
		double a, b, c;

		Utility utility = new Utility();
		System.out.println("enter value of  a,b,c in the bquadratic function a*x*x+b*x+c");
		a = utility.inputdouble();
		b = utility.inputdouble();
		c = utility.inputdouble();
		utility.rootsQuadratic(a, b, c);

	}
}
