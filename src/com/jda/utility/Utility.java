package com.jda.utility;

import java.util.Scanner;
import java.util.Random;

public class Utility {
	Scanner scaninput;

	public Utility() {
		scaninput = new Scanner(System.in);
	}

	public String inputString() {
		String input = scaninput.nextLine();
		return input;
	}
	public int inputInteger()
	{
		int input=scaninput.nextInt();
		return input;
		
	}
	  /**
    * Function to replace the username in string with your proper name
    *
    */

	public String replaceString(String inputstring, String template) {

		String Str2 = template.replace("<<UserName>>", inputstring);
		return Str2;
	}
	  /**
  * Function to get the count of  heads and tails
  *
  */
	public int[]headnTails(int input)
	{
		  Random rand = new Random();
		int[] coins = new int[2];
		  float randno;
		  for(int i=0;i<input;i++)
		  {
			  randno=rand.nextFloat( );
			  if(randno<0.5f)
				  coins[0]++;
			  else
				  coins[1]++;
			 }
		  return coins;
		  	}
/**
* Function to find leapyear or not
*
*/
public Boolean leapYear(int input)
{
Boolean leap;
if(input%4==0&&input%100!=0)
	leap=true;
else
	leap=false;

	return leap;
}
}
