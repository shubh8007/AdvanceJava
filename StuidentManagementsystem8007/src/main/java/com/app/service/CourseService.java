package com.app.service;

import java.util.List;

import com.app.entity.Course;
import com.dto.ApiResponse;
import com.dto.CourseDto;

public interface CourseService {
	List<Course> getallCourse();
  ApiResponse addStudent(CourseDto coursedto);
}
