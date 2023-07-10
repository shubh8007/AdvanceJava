package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;

import com.app.entities.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//@ToString
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class MovieDto {
	@NotBlank(message = "movie name not be blank")
	private String mname;
	private Category mtype;
	@Future(message = "Date must be after today date")
	private LocalDate rDate;
	private double budget;
	@NotBlank(message = "director not be blank")
	private String director;
	private int duration;
	@NotBlank(message = "actors not be blank")
	private String actors;
	
public MovieDto() {
	
}

public MovieDto(@NotBlank(message = "movie name not be blank") String mname, Category mtype,
		@Future(message = "Date must be after today date") LocalDate rDate, double budget,
		@NotBlank(message = "director not be blank") String director, int duration,
		@NotBlank(message = "actors not be blank") String actors) {
	super();
	this.mname = mname;
	this.mtype = mtype;
	this.rDate = rDate;
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
	return "MovieDto [mname=" + mname + ", mtype=" + mtype + ", rDate=" + rDate + ", budget=" + budget + ", director="
			+ director + ", duration=" + duration + ", actors=" + actors + "]";
}

}
