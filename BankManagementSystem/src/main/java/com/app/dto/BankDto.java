package com.app.dto;

import com.app.entities.BankType;

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
public class BankDto {
	private String fname;
	private String lname;
	private int accNo;
	private double balance;
	private BankType btype;
     private String email;
     private String password;

}
