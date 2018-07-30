package com.jda.ObjectOrientedPrograms;


import java.util.Queue;
import java.util.LinkedList;


public class CardGame2 {
	public static void main(String args[]) {
		DeckOfCards deckofcards = new DeckOfCards();
		Card card;
		int count;
	
       Player player;
       Queue<Player>playerq= new LinkedList<>();
		for (int i = 1; i < 5; i++) {
			player=new Player();
			playerq.add(player);
			if (deckofcards.getTotalnoofcards() != 0) {
				System.out.println(deckofcards.getTotalnoofcards() + 1);
				System.out.println("cards of person   " + i + "--");
				count = 9;
				while (count != 0) {

					card = deckofcards.draw();
					player.getqueue().enqueue(card.toString());
					System.out.println(card);
					count--;
				}
			}

		}
		System.out.println("AFTER REARRANGING CARDS------------");
		for(int i=1;i<5;i++)
		{  System.out.println("cards of person   "+i+"--");
			player=playerq.remove();
			player.SortCards();
			player.printQueue();
			
			
		}
	}
}
