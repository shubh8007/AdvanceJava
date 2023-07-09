package com.app.entitites;

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
@Table(name="rail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude="plist")
@JsonIgnoreType
public class Railway extends BaseEntity {
	@Column(length=20)
	private String rname;
	@OneToMany(mappedBy = "trainid",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
	private List<Passaenger> plist=new ArrayList<>();
	
	public void addPassenger(Passaenger p) {
		
		plist.add(p);
		p.setTrainid(this);
		
	}
	
	public void removePassenger(Passaenger p) {
		plist.remove(p);
		p.setTrainid(null);
	}
	

}
