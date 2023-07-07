package com.dto;

import org.springframework.stereotype.Service;

import com.app.entity.Course;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
	private String fname;
	private String lname;
	private String email;
	private double score;
	private Course assignedCourse;
}
