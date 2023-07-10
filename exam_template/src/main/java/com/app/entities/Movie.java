package com.app.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="movie")
//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
//@JsonIgnoreType

public class Movie extends BaseEntity {

	@Column(length=20)
	private String mname;
	@Enumerated(EnumType.STRING)
	private Category mtype;
	
	private LocalDate rDate;
	
	private double budget;
	@Column(length=20)
	private String director;
	private int duration;
	@Column(length=20)
	private String actors;
	
	public Movie() {
		
	}
	public Movie(String mname, Category mtype, LocalDate rDate, double budget, String director, int duration,
			String actors) {
		super();
		this.mname = mname;
		this.mtype = mtype;
		this.rDate = rDate.now();
		this.budget = budget;
		this.director = director;
		this.duration = duration;
		this.actors = actors;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Category getMtype() {
		return mtype;
	}
	public void setMtype(Category mtype) {
		this.mtype = mtype;
	}
	public LocalDate getrDate() {
		return rDate;
	}
	public void setrDate(LocalDate rDate) {
		this.rDate = rDate;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	@Override
	public String toString() {
		return "Movie [mname=" + mname + ", mtype=" + mtype + ", rDate=" + rDate + ", budget=" + budget + ", director="
				+ director + ", duration=" + duration + ", actors=" + actors + "]";
	}
	
	
}
