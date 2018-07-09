/*  Purpose:	Printing prime numbers that are palindromes and anagram which  below the given number 
 *
 *  @author  gurunadh
 *  @version 1.0
 *  @since   09-07-2017
 *
 ******************************************************************************/
package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class PrimeAnagarmPalindrome {
	public static void main(String[] args) {
		System.out.println("enter the number below which u want to find prime numbers");
		Utility utility = new Utility();
		int input = utility.inputInteger();
		System.out.println("prime numbers below are palindromes ");
		utility.printPrimePalindromes(input);
	System.out.println("prime numbers which are anagrams");
	utility.primeAnagram(input);
		
}
}
