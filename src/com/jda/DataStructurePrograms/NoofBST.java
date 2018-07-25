package com.jda.DataStructurePrograms;

import com.jda.utility.Utility;

public class NoofBST {
	public static long Catalan(int n)
	{long result=0;
	if(n<=1)
		return 1;
	for(int i=0;i<n;i++)
	{
	result+=Catalan(i)*Catalan(n-1-i);
		
	}
	return result;
	}
	
	
	public static void main(String args[]) {
		int input;
		Utility utility = new Utility();
		System.out.println("please enter the no.of nodes in BST");
		input=utility.inputInteger();
		long result=Catalan(input);
		System.out.println("no.of BST's can be formed  "+result);
		
}
}