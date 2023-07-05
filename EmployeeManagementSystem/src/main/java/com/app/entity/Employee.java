package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Table(name="emp")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude="password")
@Entity
public class Employee extends BaseEntity {
	@Column(length=20)
	private String fname;
	@Column(length=20)
	private String lname;
	@Column(length=20)
	private String email;
	@Column(length=20)
	private String password;
	private double salary;
	@Column(length=20)
	private String city;
	
	

}
