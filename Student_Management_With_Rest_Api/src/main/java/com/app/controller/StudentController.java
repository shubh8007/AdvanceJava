package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiRequestDto;
import com.app.dto.ApiResponse;

import com.app.entities.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	private StudentService studService;
	@GetMapping
	public List<Student> getAllStudent(){
		System.out.println("In stud controllere");
		return studService.getStudentDetails();
	}
//	public Student addStudent() {
//		return studService.addStudentDetails();
//	}
	@PostMapping
public ResponseEntity<?> addStudent(@RequestBody Student stud){
		System.out.println("In add student method");
	return new ResponseEntity<>(studService.addStudentDetails(stud),HttpStatus.CREATED);
	
}
	@GetMapping("/{sid}")
	public Student getStudentbyId(Long sid) {
		System.out.println("In student get by id method");
		return studService.getStudentById(sid);
		
	}
	@PutMapping
	public Student updateStudent(@RequestBody Student updateStud) {
		return studService.updateStudent(updateStud);
		
	}
	@DeleteMapping("/{sid}")
public ApiResponse deleteStudent(@PathVariable Long sid) {
	System.out.println("in delete method..");
	return new ApiResponse(studService.deleteStudent(sid));
}
	
	public ResponseEntity<?> autheStudent(@RequestBody @Valid  ApiRequestDto request){
		
		return ResponseEntity.status(HttpStatus.OK).body(studService.authenticateStudent(request));
		
	}
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateEmp(@RequestBody @Valid ApiRequestDto request) {
		System.out.println("in auth student " + request);
	//	try {
		return ResponseEntity.status(HttpStatus.OK)
				.body(studService.authenticateStudent(request));
	}
}
