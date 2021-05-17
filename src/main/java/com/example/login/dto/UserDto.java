package com.example.login.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class UserDto {
	
	@NotNull
	private String emailid;
	@NotNull
	private String password;
	@NotNull
	private String fname;
	@NotNull
	private String lname;
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
}
