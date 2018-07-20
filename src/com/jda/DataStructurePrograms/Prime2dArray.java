package com.jda.DataStructurePrograms;

import java.util.ArrayList;

import com.jda.utility.Utility;

public class Prime2dArray {

	public static void main(String args[]) {
		String[][] primenumbers = new String[10][25];
		Utility utility = new Utility();
		ArrayList<Integer> array = utility.Primesret(1000);
		int row = 0;
		int coloumn = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 25; j++) {
				primenumbers[i][j] = " ";

			}
		}

		for (int i = 0; i < array.size(); i++) {
			if (row != (array.get(i))/100) {
				row = (array.get(i))/ 100;
				coloumn = 0;
			}
			primenumbers[row][coloumn]=Integer.toString(array.get(i));
			coloumn++;
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 25; j++) {
				System.out.print(primenumbers[i][j]+"  ");

			}
			System.out.println();
		}

	}
}