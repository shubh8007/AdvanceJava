package com.app.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.ToString;
@ToString
@Getter
public class ApiResponse {
private String message;
private LocalDateTime timestamp;
public ApiResponse(String message) {
	this.message=message;
	this.timestamp=LocalDateTime.now();
	
}
}
