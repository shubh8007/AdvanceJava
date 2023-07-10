package com.app.dto;

import java.time.LocalDate;

import com.app.entities.Category;

public class MUpdatedto {
	
	private Category mtype;
	private LocalDate rDate;
	private double budget ;
	private int duration;
	private String actors;
	
	public MUpdatedto() {
		
	}
	public MUpdatedto(Category mtype, LocalDate rDate, double budget, int duration, String actors) {
		super();
		this.mtype = mtype;
		this.rDate = rDate;
		this.budget = budget;
		this.duration = duration;
		this.actors = actors;
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

}
