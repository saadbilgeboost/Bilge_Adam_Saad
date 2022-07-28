package com.bilgeadam_22ndJune2022.Question52;

public class Runner {

	public static void main(String[] args) {
		String cardTypes[] = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String cardNumbers[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		Question52 question52 = new Question52();

		question52.cardTypes = cardTypes;
		question52.cardNumbers = cardNumbers;

		int deck[] = new int[question52.cardTypes.length * question52.cardNumbers.length];

		deck = question52.deckBuilder(deck);

		question52.shuffleDeck(deck);

		question52.showDeck(deck, cardNumbers, cardTypes, 10);
	}

}
