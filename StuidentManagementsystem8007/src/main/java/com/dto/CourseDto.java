package com.dto;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor 
public class CourseDto {
	private String title;
	private LocalDate startDate;
	private LocalDate endDate;
	private double fees;
	private double minscore;
}
