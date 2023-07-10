package com.app.entities;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
//@ToString
//@Getter
//@Setter

public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long movieno;

	
	public BaseEntity() {
		
	}


	public BaseEntity(Long movieno) {
		super();
		this.movieno = movieno;
	}


	public Long getMovieno() {
		return movieno;
	}


	public void setMovieno(Long movieno) {
		this.movieno = movieno;
	}


	@Override
	public String toString() {
		return "BaseEntity [movieno=" + movieno + "]";
	}
	
}
