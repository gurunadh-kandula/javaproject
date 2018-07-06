/******************************************************************************
 *  
 *  Purpose:Print function to print 2d array
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   06-07-2017
 *
 ******************************************************************************/
package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Printing2dArray {
public static void main(String args[])
{int input,rows,coloumns;
System.out.println("enter 0 for integers ,1 for boolean,2 for double");
Utility utility = new Utility();
input = utility.inputInteger();
System.out.println("enter the no.of rows ");
rows=utility.inputInteger();
System.out.println("enter the no.of coloumns");
coloumns=utility.inputInteger();
utility.printingArray(input,rows,coloumns);
}	
}
