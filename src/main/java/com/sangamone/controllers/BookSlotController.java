package com.sangamone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.entities.BookSlot;
import com.sangamone.repositories.BookedSlotRepo;

@RestController
public class BookSlotController {
	@Autowired
	BookedSlotRepo bookRepo;
	
	
	@PostMapping("/bookSlot")
	public ResponseEntity<String> bookSlot(@RequestBody BookSlot slot) {
		bookRepo.save(slot);
		return ResponseEntity.ok("slot is booked");
		
	}
	
	@GetMapping("/viewAllBookedSlot")
	public ResponseEntity<Iterable<BookSlot>> getbookAllSlots() {
		Iterable<BookSlot> list = bookRepo.findAll();
		return ResponseEntity.ok(list);
		
	}
}
