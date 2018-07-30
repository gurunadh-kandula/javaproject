package com.jda.ObjectOrientedPrograms;

public class Card {
	private int rank, suit;
	private static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	private static String[] ranks = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13" };

	Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;

	}
	@Override
	public String toString()
	{
		return ranks[rank]+" of "+suits[suit];
		
	}

}
