package com.nike.shuffler.service;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;
import com.nike.shuffle.dao.ShuffleDao;
import com.nike.shuffle.model.Deck;
import com.nike.shuffle.service.ShuffleServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class ShuffleServiceTest {
	
	private ShuffleServiceImpl classToTest;
	
	@Mock
	private ShuffleDao dao;
	
	@Before
	public void before() {
		classToTest = new ShuffleServiceImpl();
		ReflectionTestUtils.setField(classToTest, "dao", dao);
	}
	
	@Test
	public void testPut() {
		assertEquals(1, 1);
	}
	
	@Test
	public void testGetDeckList() {
		Map<String, Deck> map = new HashMap<>();
		map.put("test1", new Deck());
		map.put("test2", new Deck());
		map.put("test3", new Deck());
		when(dao.getAll()).thenReturn(map);
		assertEquals(3, classToTest.getDeckList().size());
		assertEquals(map, classToTest.getDeckList());
	}
	
	@Test
	public void testGetDeck() {
		String name = "test";
		Deck deck = new Deck();
		when(dao.getDeck(name)).thenReturn(deck);
		assertEquals(deck, classToTest.getDeck(name));
	}
	
	@Test
	public void testDelete() {
		assertEquals(1,1);
	}
	
//	@Test
//	public void testSHuffle() {
//		//assertEquals("",service.delete(""));
//	}
	

}
