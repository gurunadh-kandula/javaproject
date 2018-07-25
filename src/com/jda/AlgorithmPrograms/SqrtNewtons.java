package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class SqrtNewtons {
	public static void main(String[] args) {
		System.out.println("please enter the number for which you need to find square root");
		Utility utility=new Utility();
		double input=utility.inputdouble();
		utility.sqrtNewton(input);
}
}
