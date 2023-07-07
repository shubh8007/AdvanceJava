package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Course;
import com.app.service.CourseServiceImpl;
import com.dto.ApiResponse;
import com.dto.CourseDto;

@RestController
@RequestMapping("/courses")
public class CourseController {
	@Autowired
	private CourseServiceImpl courseservice;
	
	public CourseController() {
		System.out.println("ctr of course controller");
	}
	@GetMapping
	public List<Course> getAllCourse(){
		return courseservice.getallCourse();
	}
	@PostMapping
	public ApiResponse addCourse(@RequestBody CourseDto coursedto) {
		return courseservice.addStudent(coursedto);
	}
	

}
