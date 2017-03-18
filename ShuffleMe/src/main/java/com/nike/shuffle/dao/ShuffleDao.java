package com.nike.shuffle.dao;

import java.util.Map;
import com.nike.shuffle.model.Deck;

public interface ShuffleDao {
	
	void addDeck(String name);
	void delDeck(String name);
	Deck getDeck(String name);
	Map<String, Deck> getAll(); 
	void addDeck(String name, Deck deck);

}
