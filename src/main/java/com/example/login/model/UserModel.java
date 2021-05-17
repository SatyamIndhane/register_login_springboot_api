package com.example.login.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.Objects;

@Entity
@Table(name = "usersData")
public class UserModel {
	@Id @GeneratedValue
	private long id;
	@NotNull
	private String emailid;
	@NotNull
	private String password;
	@NotNull
	private String fname;
	@NotNull
	private String lname;
    
    
    public long getId() {
        return id;
    }


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


	public void setId(long id) {
		this.id = id;
	}
   
    
}
