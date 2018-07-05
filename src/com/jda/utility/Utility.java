package com.jda.utility;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Utility {
	Scanner scaninput;

	public Utility() {
		scaninput = new Scanner(System.in);
	}

	public String inputString() {
		String input = scaninput.nextLine();
		return input;
	}

	public int inputInteger() {
		int input = scaninput.nextInt();
		return input;

	}

	/**
	 * Function to replace the username in string with your proper name
	 * 
	 * @param inputstring
	 * @param template
	 * @return
	 */
	public String replaceString(String inputstring, String template) {

		String Str2 = template.replace("<<UserName>>", inputstring);
		return Str2;
	}

	/**
	 * Function to get the count of heads and tails
	 * 
	 * @param input
	 * @return
	 */
	public int[] headnTails(int input) {
		Random rand = new Random();
		int[] coins = new int[2];
		float randno;
		for (int i = 0; i < input; i++) {
			randno = rand.nextFloat();
			if (randno < 0.5f)
				coins[0]++;
			else
				coins[1]++;
		}
		return coins;
	}

	/**
	 * Function to check year is a leap year or not
	 * 
	 * @param input
	 * @return
	 */
	public Boolean leapYear(int input) {
		Boolean leap;
		if (input % 400== 0 ||input % 100 == 0&&input%4==0)
			leap = true;
		else
			leap = false;

		return leap;
	}

	/**
	 * Function to print exponents of 2
	 * 
	 * @param input
	 */
	public void printing2Exponents(int input) {
		int i;
		if (input > 31)
			System.out.println("exceeding input value");
		else {
			for (i = 1; i < input; i++)
				System.out.println(Math.pow(2, i));

		}
	}

	/**
	 * Function to print nth harmonic number
	 * 
	 * @param input
	 * @return
	 */
	public double harmonicNumber(int input) {
		double sum = 0;
		if (input == 0)
			System.out.println("wrong input");
		else {
			for (int i = 1; i <= input; i++) {
				sum += (double) 1 / i;
			}

		}
		return sum;
	}

	/**
	 * Function to know prime factors of a input number
	 * 
	 * @param input
	 */
	public void printPrimeFactors(int input) {
		if (input == 0)
			System.out.println("input should not be zero");
		else {
			while (input % 2 == 0) {
				System.out.println("2");
				input = input / 2;
			}
			for (int i = 3; i <= Math.sqrt(input); i = i + 2) {
				while (input % i == 0) {
					System.out.println(i);
					input = input / i;
				}
			}
			if (input != 0)
				System.out.println(input);
		}
	}

	/**
	 * Function to find the win or fail count of the gambler
	 * 
	 * @param stake
	 * @param goal
	 * @param nooftimes
	 * @return
	 */
	public int[] gamblersFate(int stake, int goal, int nooftimes) {
		int[] fate = new int[2];
		int stakeinuse;
		Random rand = new Random();
		float randno;
		for (int i = 0; i < nooftimes; i++) {
			stakeinuse = stake;
			while (stakeinuse != 0 && stakeinuse != goal) {
				randno = rand.nextFloat();
				if (randno < 0.5f)
					stakeinuse = stakeinuse - 1;
				else
					stakeinuse = stakeinuse + 1;
			}
			if (stakeinuse == 0)
				fate[0]++;
			else
				fate[1]++;
		}
		return fate;

	}

	/**
	 * function to find no.of random numbers used to produce no.of coupons
	 * @param coupons
	 * @param noofcoupons
	 * @param ncoupons
	 * @return
	 */
	public int countsRandomProcess(int[] coupons, int noofcoupons, int ncoupons) {
		Random rand = new Random();
		int count = 0;
		Set<Integer> impset = new HashSet<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < ncoupons; i++) {
			impset.add(coupons[i]);
			
		}
		while (impset.isEmpty() != true) {
			int random = rand.nextInt(noofcoupons);
			if(set.contains(random)==false)
			{
			set.add(random);
			count++;
			}
			if (impset.contains(random) == true) {
				impset.remove(random);
				
			}
			
		}
		return count;
	}
}
