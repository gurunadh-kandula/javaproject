package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class DayWeek {
	public static void main(String[] args)
	{
		
		int month=Integer.parseInt(args[0]);
		int day=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		Utility utility = new Utility();
		utility.dayWeek(month,day,year);
		
	}
	
	

}
