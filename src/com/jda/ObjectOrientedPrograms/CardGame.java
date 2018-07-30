package com.jda.ObjectOrientedPrograms;

public class CardGame {
	public static void main(String args[]) {
		DeckOfCards deckofcards = new DeckOfCards();
		Card card;
		int count;

		for (int i = 1; i < 5; i++) {
            if(deckofcards.getTotalnoofcards()!=0)
            {
			System.out.println(deckofcards.getTotalnoofcards() + 1);
			System.out.println("cards of person   " + i+"--");
			count=9;
			while (count != 0){
			
				card = deckofcards.draw();
				System.out.println(card);
				count--;
			} 
		}
          
	}

	}
}
	
