package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/students")

public class StudentController {
	@Autowired
	private StudentService studService;
	
	
	
	@GetMapping
	public List<Student> getAllStudent(){
		System.out.println("in get all student Method.....");
		return studService.getAllStudents();
		
	}
		@PostMapping
public ResponseEntity<?> addStudentDetails(@RequestBody Student  stud){
	return new ResponseEntity<>(studService.addStudent(stud),HttpStatus.CREATED);
}

}
