package com.nike.shuffle.model;

import java.io.Serializable;

public class Card implements Comparable<Card>, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8549936732323854682L;
	private String number;
	private String suit;
	private String cardRep;
	
	public Card(String number, String suit) {
		this.number = number;
		this.suit = suit;
	}
	
	public String getCardRep() {
		return this.number + "-" + this.suit;
	}

	public void setCardRep(String cardRep) {
		this.cardRep = this.number + "-" + this.suit;
	}

	public String toString() {
		return this.number + "-" + this.suit;
	}
	
	// Default hierarchy clubs< diamonds< hearts< spades 
	@Override
	public int compareTo(Card o) {
//		if (this.suit.equalsIgnoreCase(o.suit)) {
//			if (this.number > o.number) return 1;
//			else if (this.number < o.number) return -1;
//			else if (this.number == o.number) return 0;
//		}
		return 0;
	}

}
