package com.nike.shuffle.service;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nike.shuffle.dao.ShuffleDao;
import com.nike.shuffle.model.Deck;

@Service
public class ShuffleServiceImpl implements ShuffleService{
	
	public static final String RANDOM_ALGO = "random";
	
	@Autowired
	ShuffleDao dao;

	@Override
	public void put(String name) {
		dao.addDeck(name);
	}

	@Override
	public Map<String, Deck> getDeckList() {
		return dao.getAll();
	}

	@Override
	public Deck getDeck(String name) {
		return dao.getDeck(name);
	}

	@Override
	public void delete(String name) {
		dao.delDeck(name);
	}

	@Override
	public Deck shuffle(String name, String shuffleAlgo) {
		Deck deck = dao.getDeck(name);
		if (deck != null) {
			if (shuffleAlgo.equalsIgnoreCase(RANDOM_ALGO))dao.addDeck(name,Utils.randomShuffle(dao.getDeck(name)));
			else dao.addDeck(name,Utils.handShuffle(dao.getDeck(name)));
		}
		return dao.getDeck(name);
	}

}
