package com.nike.shuffle.dao;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.nike.shuffle.model.Deck;

@Repository
public class ShuffleDaoImpl implements ShuffleDao {
	
	static Map<String, Deck> deckList = new HashMap<>();

	@Override
	public void addDeck(String name) {
		//if (deckList.get(name) == null) 
			deckList.put(name, new Deck());
	}

	@Override
	public void delDeck(String name) {
		if (deckList.get(name) != null) deckList.remove(name);
	}

	@Override
	public Deck getDeck(String name) {
		return deckList.get(name);
	}

	@Override
	public Map<String, Deck> getAll() {
		return deckList;
	}

	@Override
	public void addDeck(String name, Deck deck) {
		deckList.put(name, deck);
		
	}

}
