
package com.bilgeadam_22ndJune2022.Question52;

import java.util.Random;

/*
 * Iskambil destesini diziler ile olusturun. 
 * Sonrasında bu destedeki elemanları 
 * karıştırın ve de ilk kullanıcıya 
 * hangi 4 kartın geldiğini ekrana yazdırın.
 * 
 * */
public class Question52 {
	String cardTypes[];
	String cardNumbers[];

	public void shuffleDeck(int[] deck) {
		for (int i = 0; i < deck.length; i++) {
			int randomIndex = randomNumber();
			int temp = deck[i];
			deck[i] = deck[randomIndex];
			deck[randomIndex] = temp;
		}
	}

	public int randomNumber() {
		Random random = new Random();
		return random.nextInt(52);
	}

	public int[] deckBuilder(int[] deck) {
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		return deck;
	}

	public void showDeck(int[] deck, String[] cardNumbers, String[] cardTypes, int num_of_cards) {
//		for (int i = 0; i < cardTypes.length; i++) {
//			for (int j = 0; j < cardNumbers.length; j++) {
//				System.out.println(cardTypes[i] + " " + cardNumbers[j]);
//			}
//		} (Prints the whole deck)
		for (int i = 0; i < num_of_cards; i++) {
			int index = deck[i] / 13;
			int cardIndex = deck[i] % 13;
			String cardType = cardTypes[index];
			String cardNumber = cardNumbers[cardIndex];
			System.out.println(cardType + " " + cardNumber);
		}
	}

}
