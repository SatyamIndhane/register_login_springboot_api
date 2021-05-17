package com.example.login.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.login.dto.UserDto;
import com.example.login.model.UserModel;
import com.example.login.repository.UserRepository;
import com.example.login.util.AllUserResponse;
import com.example.login.util.Response;

@Service
public class UserService implements IService {

	@Autowired
	ModelMapper modelmapper;
	
	@Autowired
    UserRepository userRepository;
	
	@Override
	public Response register(UserDto userdto) {
	
		
		UserModel user = modelmapper.map(userdto, UserModel.class);
		Optional<UserModel> present = userRepository.findByEmailid(userdto.getEmailid());
		
		userRepository.save(user);
		return new Response(200, "registered succesfully..");
	}
	
	@Override
	public Response login(String emailid, String password)
	{
		Optional<UserModel> present = userRepository.findByEmailid(emailid);
		Optional<UserModel> ispasspresent = userRepository.findByPassword(password);
		List<UserModel> cpr = userRepository.findAll();
		
		if(present.isPresent() && ispasspresent.isPresent())
		{
			return new Response(200, "login succesfully.."); 
		}
		else
		{
			return new Response(404, "credentials invalid");
		}
	}

	@Override
	public AllUserResponse getAllUser() {
		List<UserModel> getAllUser = userRepository.findAll();
		if (getAllUser.size() > 0)
		{
			return new AllUserResponse(200, getAllUser);
		}
		else	
		{	
			return new AllUserResponse(400, getAllUser);
		}
	}

}
