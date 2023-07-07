package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="stud")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student extends BaseEntity{
	@Column(length=20)
	private String fname;
	@Column(length=20)
	private String lname;
	@Column(length=20)
	private String email;
	private double score;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="courseId",nullable = false)
	private Course assignedCourse;
	

}
