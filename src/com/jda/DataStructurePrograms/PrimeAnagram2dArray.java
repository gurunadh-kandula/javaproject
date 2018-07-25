package com.jda.DataStructurePrograms;

import java.util.ArrayList;

import com.jda.utility.Utility;

public class PrimeAnagram2dArray {

	public static void main(String args[]) {
		Utility utility = new Utility();
		ArrayList<Integer> array = utility.Primesret(1000);
		ArrayList<Integer>arraydup= utility.Primesret(1000);
		String[][] primenumbers = new String[10][25];
		int row = 0;
		int coloumn = 0;


		String[][] primeanagram = new String[80][2];
		
		

		for (int i = 0; i < 80; i++) {
			for (int j = 0; j < 2; j++) {
				primeanagram[i][j] = " ";

			}
		}
		
		for (int i = 0; i < array.size(); i++) {
			for (int j = i + 1; j < array.size(); j++) {
				boolean bool = utility.checkAnagram(Integer.toString(array.get(i)), Integer.toString(array.get(j)));
				if (bool) {
					primeanagram[row][coloumn] = Integer.toString(array.get(i));
					primeanagram[row][coloumn + 1] = Integer.toString(array.get(j));
					row++;
					coloumn = 0;
					arraydup.remove(array.get(i));
					arraydup.remove(array.get(j));
					
				}

			}

		}
		int j;
		System.out.println("These are anagrams which are prime");
		for (int i = 0; i < 80; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print(primeanagram[i][j] + " ");
				

			}

			System.out.println();
		}
		row=0;coloumn=0;
		System.out.println("These are prime which are not prime");
		for (int i = 0; i < arraydup.size();i++){
			if (row != (arraydup.get(i)/100)) {
				row = (arraydup.get(i)/100);
				coloumn = 0;
			}
			primenumbers[row][coloumn]=Integer.toString(arraydup.get(i));
			coloumn++;
		}

		for (int i = 0; i < 10; i++) {
			for ( j = 0; j < 25; j++) {
				if(primenumbers[i][j]==null)
					System.out.print(" ");
				else
				System.out.print(primenumbers[i][j]+"  ");

			}
			System.out.println();
		}

	}
	
}