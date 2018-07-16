package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class TemperatureConversion {
	public static void main(String[] args) {
		System.out.println("pleasen enter in which units you are entering temperature");
		Utility utility=new Utility();
		String string=new String();
		string=utility.inputString();
		System.out.println("please enter the temperature");
		int input=utility.inputInteger();
		if(string.compareTo("celsius")==0)
			utility.temperatureConversion(input,0);
		else
			utility.temperatureConversion(input,1);
		

}

}