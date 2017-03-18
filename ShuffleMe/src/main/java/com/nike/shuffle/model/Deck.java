package com.nike.shuffle.model;

import java.io.Serializable;

public class Deck implements Serializable, Comparable<Deck> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 414745909220681658L;

	private Card[] cards;
	
	public static final String[] indexes = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",  "J", "Q", "K" }; 
	public static final String[] suits = { "spades", "aces", "diamonds", "clubs"}; 
	
	public Deck() {
		init();
	}
	
	void init() {
		cards = new Card[52]; 
		int count =0;
		for (int i=0; i<52; i += 13) {
			for (int j=0; j<13; j++) {
				cards[i+j] = new Card(indexes[j],suits[count]);
			}
			count++;
		}
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	@Override
	public int compareTo(Deck o) {
		if (this.cards.length == o.cards.length) return 0;
		else return -1;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<this.cards.length;i++) {
			sb.append(this.cards[i]);
		}
		return sb.toString();
	}

	
}
