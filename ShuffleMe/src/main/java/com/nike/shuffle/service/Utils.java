package com.nike.shuffle.service;

import java.util.Random;

import com.nike.shuffle.model.Card;
import com.nike.shuffle.model.Deck;

public class Utils {
	
	// Implementing Knuth's Shuffle
	public static Deck randomShuffle(Deck deck) {
		Card[] cards = deck.getCards();
		Random rand = new Random();
		for (int i=1; i<cards.length; i++) {
			int det = rand.nextInt(i);
			cards = swap(cards, i, det);
		}
		deck.setCards(cards);
		return deck;
	}

	// Implementing hand shuffle algorithm recursive, 
	// shuffle random number of times between 1-10
	public static Deck handShuffle(Deck deck) {
		Deck newDeck = new Deck();
		Random rand = new Random();
		int det = rand.nextInt(10);
		Card[] cards = null;
		cards = handShuffleCards(deck.getCards(), det);
		newDeck.setCards(cards);
		return newDeck;
	}
	
	private static Card[] handShuffleCards(Card[] cards, int rand) {
		if (rand == 0) return cards;
		int length = cards.length;
		Card[] newCards = new Card[length];
		for (int i=0; i<length; i ++) {
			if (i%2 == 0)newCards[i] = cards[i];
			else newCards[i] = cards[length-1-i];
		}
		return handShuffleCards(newCards, rand-1);
	}
	
	private static Card[] swap(Card[] cards, int i, int j) {
		Card temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;
		return cards;
	}
}
