package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.app.entitites.Railway;
import com.app.entitites.ReservationType;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreType
public class PassengerDto {
	@NotBlank(message = "fname should be filled ")
private String fname;
	@NotBlank(message = "lname should be filled ")
private String lname;
	@Email
	@NotBlank
private String email;
	@NotBlank
	
private String password;
	@Future
private LocalDate bookDate;
	@NotBlank
private String spoint;
	@NotBlank
private String lpoint;

private ReservationType type;

private Long  trainid;

}
