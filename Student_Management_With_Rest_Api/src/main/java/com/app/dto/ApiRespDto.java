package com.app.dto;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ApiRespDto {
	private String first_Name;
	private String last_name;
	private String department;
	private LocalDate bdate;
	private double fees;

}
