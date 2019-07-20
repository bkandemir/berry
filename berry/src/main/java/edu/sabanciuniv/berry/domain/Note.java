package edu.sabanciuniv.berry.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
//@SuppressWarnings("deprecation")
//@Entity
//@Table(name = "note")
public class Note {

	private int id;
	private String courseName;
	private String courseID;
	private String year;
	private String semester;
	private String noteType;
	private String userID;//it should be userID
}
