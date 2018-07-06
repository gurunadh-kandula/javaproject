/******************************************************************************
 *  
 *  Purpose:Finds the euclidean distance between (x,y) to the origin (0,0)
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   06-07-2017
 *
 ******************************************************************************/
package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Distance{
	public static void main(String[] args) {
		
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		Utility utility = new Utility();
		 double distance=utility.euclideanDistance(x,y);
		 System.out.println(distance);
	}
}
