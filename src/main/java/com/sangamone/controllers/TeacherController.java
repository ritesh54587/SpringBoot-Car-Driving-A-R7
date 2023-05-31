package com.sangamone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sangamone.entities.Teacher;
import com.sangamone.repositories.TeacherRepository;

@RestController
public class TeacherController {
	
	
	@Autowired
	TeacherRepository teacherRepo;
	
	
	@PostMapping("/registerTeacher")
	public ResponseEntity<String> registerTeacher(@RequestBody Teacher teacher) {
		teacherRepo.save(teacher);
		return ResponseEntity.ok("Teacher registered successfully");
		
	}
	
	 @GetMapping("/findAllTeacher")
	    public List<Teacher> getTeacherById() {
		  List<Teacher> list = teacherRepo.findAll();
		 
			return list;
		 
	 }
	 }
	       
	        


