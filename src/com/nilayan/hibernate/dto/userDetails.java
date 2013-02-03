package com.nilayan.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class userDetails {
	@Id
	private int userid;
	private String firstName;
	private String lastName;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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

}
