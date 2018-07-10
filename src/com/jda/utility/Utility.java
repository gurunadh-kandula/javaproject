package com.jda.utility;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.PrintWriter;

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

	public boolean inputboolean() {
		boolean bool = scaninput.nextBoolean();
		return bool;
	}

	public double inputdouble() {
		double input = scaninput.nextDouble();
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
		if (input % 400 == 0 || input % 100 == 0 && input % 4 == 0)
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
	 * 
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
			if (set.contains(random) == false) {
				set.add(random);
				count++;
			}
			if (impset.contains(random) == true) {
				impset.remove(random);

			}

		}
		return count;
	}

	/**
	 * Printing 2d array using printwriter
	 * 
	 * @param input
	 * @param m
	 * @param n
	 */

	public void printingArray(int input, int m, int n) {
		PrintWriter out = new PrintWriter(System.out);
		switch (input) {
		case 0: {
			int[][] array = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					array[i][j] = inputInteger();
				}
			}
			System.out.println("integer 2d array is");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					out.print(array[i][j] + "  ");
				}
				out.println();
			}
			break;
		}

		case 1: {
			boolean[][] array1 = new boolean[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					array1[i][j] = inputboolean();
				}
			}
			System.out.println("boolean 2d array is");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					out.print(array1[i][j] + " ");
				}
				out.println();
			}

			break;
		}
		case 2: {
			double[][] array2 = new double[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					array2[i][j] = inputdouble();
				}
			}
			System.out.println("double 2d array is");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					out.print(array2[i][j] + " ");
				}
				out.println();
			}

		}
		}
		out.flush();
		out.close();
	}

	/**
	 * Function to find the euclidean distance between (x,y) coordinates and
	 * origin(0,0)
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public double euclideanDistance(int x, int y) {
		double distance;
		distance = (double) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return distance;

	}

	/**
	 * Function to get permutations of a string using recursion
	 * 
	 * @param inputstring
	 * @param start
	 * @param end
	 */
	public String swap(String input, int i, int j) {
		char temp;
		char[] inputarray = input.toCharArray();
		temp = inputarray[i];
		inputarray[i] = inputarray[j];
		inputarray[j] = temp;
		input = String.valueOf(inputarray);
		return input;

	}

	public boolean shouldSwap(String inputstring, int start, int current) {
		boolean check = true;
		char[] inputarray = inputstring.toCharArray();
		for (int i = start; i < current; i++) {
			if (inputarray[i] == inputarray[current])
				check = false;
		}

		return check;
	}

	public void permutationsOfStringUsingRecursion(String inputstring, int start, int end) {
		int i;
		boolean check;
		if (start == end)
			System.out.println(inputstring);
		for (i = start; i <= end; i++) {
			check = shouldSwap(inputstring, start, i);
			if (check) {
				inputstring = swap(inputstring, start, i);
				permutationsOfStringUsingRecursion(inputstring, start + 1, end);
				inputstring = swap(inputstring, start, i);
			}
		}
	}

	/**
	 * Function to find the triplets in the given array that make the sum equal
	 * to zero
	 * 
	 * @param numberarray
	 */
	public void findingTriplets(int numberarray[]) {
		int i, j, k, count = 0;
		int length = numberarray.length;
		for (i = 0; i < length - 2; i++) {
			for (j = 1 + i; j < length - 1; j++) {
				for (k = 1 + j; k < length; k++) {
					if ((numberarray[i] + numberarray[j] + numberarray[k]) == 0) {
						count++;
						System.out.print(numberarray[i] + " ");
						System.out.print(numberarray[j] + " ");
						System.out.print(numberarray[k] + "");
						System.out.println();
					}
				}

			}

		}
		System.out.println("no.of triplets found in the array are  " + count);
	}

	/**
	 * stopwatch works between start and end command
	 * 
	 * @param flag
	 * @return
	 */
	public void stopWatch() {
		long start = System.currentTimeMillis();
		long j = 1;
		for (int i = 0; i < 12000; i++) {
			j = j + 3;
			System.out.println(j);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}

	/**
	 * Prints the roots of Quadratic function
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public void rootsQuadratic(double a, double b, double c) {
		double delta;
		delta = b * b - (4 * a * c);
		double root1 = (-b + Math.sqrt(delta)) / (2 * a);
		double root2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("roots of the given quadratic function are   " + root1 + root2);

	}

	/**
	 * Compute the windchill value using formula given by National Weather
	 * Service
	 * 
	 * @param t
	 * @param v
	 * @return
	 */
	public double windChill(double t, double v) {
		double windchill;
		windchill = 35.74 + 0.6125 * t + (0.4275 * t - 35.75) * (Math.pow(v, 0.16));

		return windchill;
	}

	/**
	 * To check the functions are anagram or not
	 * 
	 * @param string1
	 * @param string2
	 */
	public boolean checkAnagram(String string1, String string2) {
		boolean bool;
		string1 = string1.replaceAll("\\s+", "");
		string1 = string1.toLowerCase();
		string2 = string2.replaceAll("\\s+", "");
		string2 = string2.toLowerCase();
		if (string1.length() == string2.length()) {
			char[] string1array = string1.toCharArray();
			char[] string2array = string2.toCharArray();
			Arrays.sort(string1array);
			Arrays.sort(string2array);

			bool = Arrays.equals(string1array, string2array);
			return bool;
		} else
			return false;
	}

	/**
	 * To check a number is a prime or not
	 * 
	 * @param current
	 * @return
	 */
	public boolean checkPrime(int current) {
		for (int i = 2; i <= Math.sqrt(current); i++) {
			if (current % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * For finding the prime numbers below the given number
	 * 
	 * @param input
	 */
	public void printPrimes(int input) {
		int i;
		for (i = 2; i <= input; i++) {
			if (checkPrime(i))
				System.out.println(i);
			else
				continue;

		}
	}

	/**
	 * function to check whether a number is a palindrome or not
	 * 
	 * @param current
	 * @return
	 */
	public boolean checkPalindrome(int current) {
		int last, first = 0, count = 0;
		last = current % 10;
		int flag = current;
		while (flag != 0) {
			flag = flag / 10;
			count++;
		}
		if (count == 3)
			first = current / 100;
		if (count == 2)
			first = current / 10;
		if (count == 1)
			first = current;
		if (first == last)
			return true;
		else
			return false;
	}

	/**
	 * Prints prime numbers which are palindromes
	 * 
	 * @param input
	 */
	public void printPrimePalindromes(int input) {
		int i;
		for (i = 2; i <= input; i++) {
			if (checkPrime(i)) {
				if (checkPalindrome(i))
					System.out.println(i);
			} else
				continue;

		}

	}

	/**
	 * prints prime numbers which are anagrams
	 * 
	 * @param input
	 */
	public void primeAnagram(int input) {
		int i;
		ArrayList<String> list = new ArrayList<String>();
		for (i = 2; i <= input; i++) {
			if (checkPrime(i))
				list.add(Integer.toString(i));
		}
		for (i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				boolean bool = checkAnagram(list.get(i), list.get(j));
				if (bool) {
					System.out.println("These prime numbers are anagram");
					System.out.println(list.get(i));
					System.out.println(list.get(j));

				}

			}
		}
	}

	public boolean binarySearchInt(int[] array, int search) {
		int start = 0;
		int mid;
		int end = array.length;
		Arrays.sort(array);
		while (start <= end) {
			mid = (end - start) / 2;
			if (array[mid] == search)
				return true;
			else {
				if (search < array[mid])
					end = mid - 1;
				else
					start = mid + 1;
			}
		}
		return false;
	}
	public binarysearchString
}