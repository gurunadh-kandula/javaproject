package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

class Notes {

	static int minNotes(int notes[], int m, int V) {

		int table[] = new int[V + 1];

		table[0] = 0;

		for (int i = 1; i <= V; i++)
			table[i] = Integer.MAX_VALUE;

		for (int i = 1; i <= V; i++) {

			for (int j = 0; j < m; j++)
				if (notes[j] <= i) {
					int sub_res = table[i - notes[j]];
					if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
						table[i] = sub_res + 1;

				}

		}
		return table[V];

	}

	
	public static void main(String[] args) {
		int notes[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };
		int m = notes.length;
		System.out.println("please enter the value for which u need change");
		Utility utility=new Utility();
		int V=utility.inputInteger();
		System.out.println("Minimum no.of notes required is " + minNotes(notes, m, V));
	}
}
