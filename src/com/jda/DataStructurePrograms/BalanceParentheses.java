package com.jda.DataStructurePrograms;

import com.jda.utility.Stack;
import com.jda.utility.Utility;

public class BalanceParentheses {
	public static boolean balanceChecker(char[] inputarray) {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < inputarray.length; i++) {

			if (inputarray[i] == '(')
				st.push(inputarray[i]);

			if (inputarray[i] == ')') {

				if (st.isEmpty())
					return false;
				else if (st.pop() != '(')
					return false;

			}

		}

		if (st.isEmpty())
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		System.out.println("please enter the Arithmetic expression");

		Utility utility = new Utility();
		String input = utility.inputstring();
		char[] inputarray = input.toCharArray();
		boolean bool = balanceChecker(inputarray);
		if (bool)
			System.out.println("expression is balanced");
		else
			System.out.println("expression is not balanced");
	}

}
