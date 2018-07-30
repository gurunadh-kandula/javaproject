package com.jda.ObjectOrientedPrograms;

import java.util.Random;

public class DeckOfCards {
	private Card[] cards;
	int noofcards;

	DeckOfCards() {
		noofcards = 51;
		cards = new Card[52];
		int x = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cards[x] = new Card(i, j);
				x++;
			}
		}

	}

	public Card draw() {
		Random generator = new Random();
		int index = 0;
		do {
			index = generator.nextInt(52);

		} while (cards[index] == null);
		noofcards--;
		Card temp = cards[index];
		cards[index] = null;
		return temp;

	}
	public int getTotalnoofcards()
	{
		return noofcards;
	}
}
