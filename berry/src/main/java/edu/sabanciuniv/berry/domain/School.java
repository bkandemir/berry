package edu.sabanciuniv.berry.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class School {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="id", nullable = false, updatable=false)
	private long id;
	private String name;
	private String location;
	
	
	public School() {
		super();
	}


	public School(long id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}

}
