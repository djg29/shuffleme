package com.nike.shuffle.service;

import java.util.Map;
import com.nike.shuffle.model.Deck;

public interface ShuffleService {
	
	void put(String name);
	Map<String, Deck> getDeckList();
	Deck getDeck(String name);
	void delete(String name);
	Deck shuffle(String name, String shuffleAlgo);

}
