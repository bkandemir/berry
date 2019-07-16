package edu.sabanciuniv.berry.domain;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.sabanciuniv.berry.domain.security.*;

@Entity
@Table(name = "user")
public class User{
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="id", nullable = false, updatable=false)
	 private long id;
	 private String firstName;
	 private String lastName;
	 private String email;
	 private String username;
	 private String password;
	 private int schoolID;
	 private boolean enabled=true;
	 
	 @ManyToMany
	 @JsonIgnore
	 private Set<Role> roles;

	public User() {
		super();
	}

	public User(long id, String firstName, String lastName, String email, String username, String password,
			int schoolID, boolean enabled, Set<Role> roles) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.schoolID = schoolID;
		this.enabled = enabled;
		this.roles = roles;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSchoolID() {
		return schoolID;
	}

	public void setSchoolID(int schoolID) {
		this.schoolID = schoolID;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}


}
