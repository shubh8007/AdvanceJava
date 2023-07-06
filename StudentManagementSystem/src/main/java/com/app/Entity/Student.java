package com.app.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude="password")
public class Student extends BaseEntity{
	@Column(length=20)
	private String fname;
	@Column(length=20)
	private String lname;
	private LocalDate bdate;
	@Column(length=20)
	private String email;
	@Column(length=20)
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private CourseType type;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="course_id")
	private Course assignCourse;
	
}
