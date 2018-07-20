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

	public String inputstring() {
		String input = scaninput.next();
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
	 * Function to find the triplets in the given array that make the sum equal to
	 * zero
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
	 * Compute the windchill value using formula given by National Weather Service
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
	public ArrayList<Integer> Primesret(int input) {
		int i;
		ArrayList<Integer>array=new ArrayList<Integer>();
		for (i = 2; i <= input; i++) {
			if (checkPrime(i))
				array.add(i);
			else
				continue;

		}
		return array;
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

	public static <T extends Comparable<T>> void genericBubbleSort(T[] inputarray, int length) {
		T temp;
		boolean swap = false;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < (length - i - 1); j++) {
				if (inputarray[j].compareTo(inputarray[j + 1]) > 0) {
					temp = inputarray[j + 1];
					inputarray[j + 1] = inputarray[j];
					inputarray[j] = temp;
					swap = true;
				}

			}
			if (swap == false)
				break;
		}

		for (int i = 0; i < length; i++) {
			System.out.println(inputarray[i]);
		}

	}

	public static <S extends Comparable<S>> S[] genericInsertionSort(S[] inputarray, int length) {
		S current;
		int j;
		for (int i = 1; i < length; i++) {
			current = inputarray[i];
			j = i - 1;
			while (j >= 0 && (inputarray[j].compareTo(current)) > 0) {
				inputarray[j + 1] = inputarray[j];
				j = j - 1;
			}
			inputarray[j + 1] = current;
		}

		for (int i = 0; i < length; i++) {
			System.out.println(inputarray[i]);
		}
		return inputarray;
	}

	public static <K extends Comparable<K>> boolean genericBinarySearch(K[] inputarray, K search, int start, int end) {
		int mid;
		mid = ((start +end) / 2);
		if (search.compareTo(inputarray[mid]) == 0)
			return true;
		else {
			if (search.compareTo(inputarray[mid]) < 0)
				genericBinarySearch(inputarray, search, start, mid - 1);
			genericBinarySearch(inputarray, search, mid + 1, end);

		}
		return false;

	}

	/**
	 * Function to guess the number
	 * 
	 * @param n
	 * @param start
	 * @param end
	 */
	public void guessNumber(int n, int start, int end) {
		String str;

		if (n > 1) {
			int mid = ((start + end) / 2);
			System.out.println("Is the number is between " + start + " " + mid);
			str = inputstring();
			if (str.equals("yes"))
				guessNumber(n - 1, start, mid);
			else
				guessNumber(n - 1, mid + 1, end);

		} else {
			System.out.println("is the number is  " + start);
			String str1 = inputstring();
			if (str1.equals("yes"))
				System.out.println("your number is  " + start);
			else
				System.out.println("your number is  " + end);

		}
	}

	/**
	 * Function to merge the string arrays
	 * 
	 * @param stringarray
	 * @param start
	 * @param mid
	 * @param end
	 */
	public void merge(String stringarray[], int start, int mid, int end) {
		int length1 = mid - start + 1;
		int length2 = end - mid;
		String[] left = new String[length1];
		String[] right = new String[length2];
		for (int i = 0; i < length1; i++) {
			left[i] = stringarray[i + start];

		}
		for (int i = 0; i < length2; i++) {
			right[i] = stringarray[i + mid + 1];

		}
		int i = 0, j = 0;
		int k = start;
		while (i < length1 && j < length2) {
			if (left[i].compareTo(right[j]) <= 0) {
				stringarray[k] = left[i];
				i++;
			} else {
				stringarray[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < length1) {
			stringarray[k] = left[i];
			k++;
			i++;
		}
		while (j < length2) {
			stringarray[k] = right[j];
			k++;
			j++;
		}

	}

	public void printArray(String[] stringarray) {
		int n = stringarray.length;
		for (int i = 0; i < n; ++i)
			System.out.print(stringarray[i] + " ");

	}

	/**
	 * Sorting of two String arrays using mergesort
	 * 
	 * @param stringarray
	 * @param start
	 * @param end
	 */
	public void mergeSort(String stringarray[], int start, int end) {
		while (start < end) {
			int mid = ((start + end) / 2);
			mergeSort(stringarray, start, mid);
			mergeSort(stringarray, mid + 1, end);
			merge(stringarray, start, mid, end);
		}
	}

	/*
	 * public int vendingMachine( int[] notearray,int length,int input) {
	 * System.out.println(input); if(input==0) return 0; int
	 * result=Integer.MAX_VALUE; for(int i=0;i<length;i++) { if(notearray[i]<=input)
	 * { int subresult=vendingMachine(notearray,length,input-notearray[i]);
	 * if(subresult!=Integer.MAX_VALUE&&subresult+1<result) result=subresult+1; } }
	 * 
	 * return result; }
	 */
	public int dayWeek(int month, int day, int year) {
		int y0, x, m0, d0;
		y0 = year - (14 - month) / 12;
		x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = month + 12 * ((14 - month) / 12) - 2;
		d0 = (day + x + 31 * m0 / 12) % 7;
		return d0;
		
	}

	/**
	 * converts celsius to fahrenheit,fahrenheit to celsius
	 * 
	 * @param input
	 * @param s
	 */
	public void temperatureConversion(int input, int s) {
		int value;
		if (s == 0) {
			value = (input * 9 / 5) + 32;
			System.out.println("Fahrenheit temperature is " + value);
		} else {
			value = (input - 32) * 5 / 9;
			System.out.println("Celsius temperature is " + value);
		}
	}

	/**
	 * It find the monthly payment using the formula
	 * 
	 * @param P
	 * @param Y
	 * @param R
	 */
	public void monthlyPayment(double P, double Y, double R) {
		double n = 12 * Y;
		double r = R / (12 * 100);
		double payment = (P * r) / (1 - Math.pow(1 + r, -n));
		System.out.println("payment is  " + payment);

	}

	/**
	 * newton method to find square root
	 * 
	 * @param input
	 */
	public void sqrtNewton(double input) {
		double i = input;
		double epsilon = 1e-15;
		while (Math.abs(i - input / i) > (epsilon * i)) {

			i = ((input / i) + i) / 2;
		}
		System.out.println("the square root of the number is" + i);
	}

	/**
	 * convert the decimal to binary
	 * 
	 * @param input
	 */
	public void toBinary(int input) {
		if (input > 1)
			toBinary(input / 2);
		System.out.print(input % 2 + " ");

	}

/*	public void swapNibble(int input) {
		int n = (int) (Math.log(input) / Math.log(2));
		int[] arr = new int[n+1];

		for (int i = n; i >= 0; i--) {
			int exp = (int) Math.pow(2, i);

			if ((exp & input) == exp) {
				arr[n - i] = 1;
				System.out.print("1");

			} else {
				arr[n - i] = 0;
				System.out.print("0");

			}
		}

	}*/
	
	
	public void swapNibble(int input)
	{
		System.out.println((input&0x0F)<<4|(input&0xF0)>>4);
	}
}
