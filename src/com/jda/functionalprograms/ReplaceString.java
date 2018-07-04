/******************************************************************************
 *  
 *  Purpose: Replace the string in a string template
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   04-07-2017
 *
 ******************************************************************************/
package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class ReplaceString {
	public static void main(String[] args) {
		String input;
		String output;
		String template = "Hello <<UserName>>, How are you?";

		Utility utility = new Utility();
		input = utility.inputString();
		output = utility.replaceString(input, template);
		System.out.println(output);
	}
}
