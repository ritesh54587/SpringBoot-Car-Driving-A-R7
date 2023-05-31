package com.sangamone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.entities.CreateSlot;
import com.sangamone.repositories.SlotRepository;

@RestController
public class SlotController {

	@Autowired
	SlotRepository slotRepo;
	
	
	@PostMapping("/createSlot")
	public ResponseEntity<String> createSlot(@RequestBody CreateSlot slot) {
		slotRepo.save(slot);
		return ResponseEntity.ok("slot is created");
		
	}
	
	@GetMapping("/viewAllSlots")
	public ResponseEntity<List<CreateSlot>> getAllSlots() {
		List<CreateSlot> list = slotRepo.findAll();
		return ResponseEntity.ok(list);
		
	}
}
