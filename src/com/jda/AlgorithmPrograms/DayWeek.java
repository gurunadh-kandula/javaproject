package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class DayWeek {
	public static void main(String[] args)
	{
		
		int month=Integer.parseInt(args[0]);
		int day=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		Utility utility = new Utility();
		int d0=utility.dayWeek(month,day,year);
		if (d0 == 0)
			System.out.println("sunday");
		if (d0 == 1)
			System.out.println("monday");
		if (d0 == 2)
			System.out.println("tuesday");
		if (d0 == 3)
			System.out.println("wednesday");
		if (d0 == 4)
			System.out.println("thursday");
		if (d0 == 5)
			System.out.println("Friday");

		if (d0 == 6)
			System.out.println("saturday");
		
	}
	
	

}
