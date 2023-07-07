package com.app.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="course")
@NoArgsConstructor

@Getter
@Setter 
@ToString
@JsonIgnoreType
public class Course extends BaseEntity  {
@Column(length=20,unique = true)	
private String title;
private LocalDate startDate;
private LocalDate endDate;
private double fees;
private double minscore;
@OneToMany(mappedBy = "assignedCourse",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
private List<Student> studList=new ArrayList<>();
public Course(String title, LocalDate startDate, LocalDate endDate, double fees, double minscore) {
	super();
	this.title = title;
	this.startDate = startDate;
	this.endDate = endDate;
	this.fees = fees;
	this.minscore = minscore;
}






}
