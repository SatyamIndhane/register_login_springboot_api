package com.example.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.dto.UserDto;
import com.example.login.model.UserModel;
import com.example.login.repository.UserRepository;
import com.example.login.service.IService;
import com.example.login.util.AllUserResponse;
import com.example.login.util.Response;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RestController
public class UserController {
    
    
    @Autowired(required=true)
    IService service;
    
    @Autowired
    UserRepository repository;
   
    @PostMapping("/users")
    ResponseEntity<Response> registerUser(@RequestBody UserDto userdto) {
        Response response = service.register(userdto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @PostMapping("/login")
    ResponseEntity<Response> loginUser(@RequestParam("emailid") String emailid,
    		@RequestParam("password") String password) {
        Response response = service.login(emailid, password);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("/getAllUsers")
    ResponseEntity<AllUserResponse> getAllUser() {
        AllUserResponse response = service.getAllUser();
        return new ResponseEntity<>(response, HttpStatus.OK);
        }
        
}