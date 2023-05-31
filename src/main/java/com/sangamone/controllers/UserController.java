package com.sangamone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.entities.User;
import com.sangamone.repositories.UserRepository;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepo;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userRepo.save(user);
		return ResponseEntity.ok("User Registered successfully");
    }
    
    @GetMapping("/findAllUser")
    public ResponseEntity<List<User>> getAllusers() {
    	List<User> user = userRepo.findAll();
		return ResponseEntity.ok(user);
    	
    }
}


