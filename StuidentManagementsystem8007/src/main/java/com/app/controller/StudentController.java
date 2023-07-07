package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student;
import com.app.service.StudentServiceImpl;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentServiceImpl studService;
	
	public StudentController() {
		System.out.println("in stud ctr...");
		
		
	}
	@GetMapping
	public List<Student> getAllstudent(){
		return studService.getAllstudents();
	}
	

}
