package com.nike.shuffle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nike.shuffle.service.ShuffleService;

@RestController
@RequestMapping("/shuffler")
public class MainController {
	
	@Value("${shuffleAlgo}")
	private String shuffleAlgo;
	
	@Autowired
	private ShuffleService service;

	
	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> get(@RequestParam String name) {
		return ResponseEntity.ok(service.getDeck(name));
	}
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(service.getDeckList());
	}
	
	@RequestMapping(value = "/put", method = RequestMethod.PUT)
	public void put(@RequestParam String name) {
		service.put(name);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public void del(@RequestParam String name) {
		service.delete(name);
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public ResponseEntity<?> post(@RequestParam String name) {
		return ResponseEntity.ok(service.shuffle(name, shuffleAlgo));
	}
	
}
