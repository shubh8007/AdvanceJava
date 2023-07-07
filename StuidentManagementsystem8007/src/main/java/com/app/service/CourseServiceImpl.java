package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Course;
import com.app.repository.CourseRepository;
import com.dto.ApiResponse;
import com.dto.CourseDto;
@Service
@Transactional
public class CourseServiceImpl implements CourseService {
	@Autowired
private CourseRepository courseRepo;
	@Autowired
	private ModelMapper mapper;
	public CourseServiceImpl() {
		System.out.println("hey ");
	}
	@Override
	public List<Course> getallCourse() {
	
		return courseRepo.findAll();
	}
	@Override
	public ApiResponse addStudent(CourseDto coursedto) {
		Course course =new Course(coursedto.getTitle(),coursedto.getStartDate(),coursedto.getEndDate(),coursedto.getFees(),coursedto.getMinscore());
		courseRepo.save(course);
		return new ApiResponse("Course Added Sucessfully");
	}

}
