package com.app.controller;

import java.util.List;

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

import com.app.entity.Employee;
import com.app.service.EmployeeServiceImpl;

import cm.app.dto.ApiResponse;
@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl empservice;
	 public EmployeeController() {
		 System.out.println("In employeeController...");
	 }
	 @GetMapping
	 public List<Employee> getEmployee(){
		 System.out.println("In list Employeeservice");
		 return empservice.getAllEmployee();
	 }
	 @PostMapping
	 public ResponseEntity<Employee>  saveEmpDetails(@RequestBody Employee emp){
		 System.out.println("In add emp details controller....");
		 return new ResponseEntity<>(empservice.addEmployee(emp),HttpStatus.CREATED);
	 }
	 
	 @DeleteMapping("/{id}")
	public ApiResponse deleteById(@PathVariable  Long id) {
		System.out.println("In delte employee service method...");
		return new ApiResponse(empservice.deleteById(id));
	}
	 
	 @PutMapping("/{id}")
	 public Employee updateEmployees(@RequestBody Employee emps) {
		 System.out.println("In update controller method");
		 return empservice.updateEmployee(emps);
	 }
	 @GetMapping("/{id}")
	 public Employee getEmployeeByid(Long id) {
		 return empservice.getEmployeeById(id);
		 
	 }

}
