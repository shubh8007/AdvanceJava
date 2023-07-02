package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString
@Getter
@Setter
public class ApiRequestDto {
	@NotBlank(message="email not blank")
	@Email(message="email required")
private String email;
	@NotBlank(message="password not blank")
private String password;
}
