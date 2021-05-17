package com.example.login.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.login.dto.UserDto;
import com.example.login.model.UserModel;
import com.example.login.util.AllUserResponse;
import com.example.login.util.Response;


@Service
public interface IService {

	
	public Response register(UserDto userdto);
	
	public Response login(String emailid, String password);

	public AllUserResponse getAllUser();
	
}
