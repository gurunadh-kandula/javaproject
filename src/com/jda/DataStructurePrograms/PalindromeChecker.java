package com.jda.DataStructurePrograms;

import com.jda.utility.Deque;

import com.jda.utility.Utility;
import com.jda.utility.Deque.Dqnode;

public class PalindromeChecker {
	public static boolean palindromechecker(char[] inputarray) {
		Deque<Character> dq = new Deque<Character>();
		for(int i=0;i<inputarray.length;i++)
		{
			dq.insertEnd(inputarray[i]);
			
		}
		while (dq.size > 1) {
			Dqnode<Character> first = dq.deleteFront();
			Dqnode<Character> last = dq.deleteEnd();
			if (first.value != last.value)
				return false;
		}
		return true;
	}

	public static void main(String args[]) {
		System.out.println("please enter the string");

		Utility utility = new Utility();
		String input = utility.inputstring();
		char[] inputarray = input.toCharArray();
		boolean bool = palindromechecker(inputarray);
		if (bool)
			System.out.println("Entered string is a palindrome");
		else
			System.out.println("entered string is not a palindrome");
	}
}