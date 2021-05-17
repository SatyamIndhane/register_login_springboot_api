package com.example.login.util;


import org.springframework.stereotype.Component;

import com.example.login.model.UserModel;

@Component
public class Response {

	private Integer statusCode;
	private String statusMessage;
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public Response(Integer statusCode, String statusMessage) {
		super();
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
	}
	public Response() {    
		// gives error without default constructor ?
	}




	
	
	
		
}
