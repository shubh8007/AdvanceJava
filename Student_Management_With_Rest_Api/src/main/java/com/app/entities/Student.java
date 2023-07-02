package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="student2")
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class Student extends BaseEntity {
	@Column(name="fname",length=20)
	private String first_Name;
	@Column(name="lname",length=20)
	private  String last_Name;
	@Column(name="dept",length=20)
	private String department;
	@Column(length=20)
	private String email;
	@Column(length=20)
	private String password;
	private LocalDate bdate;
	private double fees;
	
	

}
