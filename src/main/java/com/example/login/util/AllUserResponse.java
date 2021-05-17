package com.example.login.util;

import java.util.List;

import com.example.login.model.UserModel;

public class AllUserResponse {

	private Integer statusCode;
	private List<UserModel> allUsers;
	
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public List<UserModel> getAllUsers() {
		return allUsers;
	}
	public void setAllUsers(List<UserModel> allUsers) {
		this.allUsers = allUsers;
	}
	public AllUserResponse(Integer statusCode, List<UserModel> allUsers) {
		super();
		this.statusCode = statusCode;
		this.allUsers = allUsers;
	}
	
}
