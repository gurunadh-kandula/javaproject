/*  Purpose:	Checks two strings are anagrams or not
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   09-07-2017
 *
 ******************************************************************************/
 package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class AnagramDetection {
	public static void main(String[] args) {
		String string1;
		String string2;
		Utility utility = new Utility();
		System.out.println("enter the Strings u want to compare");
		string1= utility.inputString();
		string2= utility.inputString();
		utility.checkAnagram(string1,string2);

}
}
