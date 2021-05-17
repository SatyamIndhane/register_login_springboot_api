package com.example.login.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.login.model.UserModel;


public interface UserRepository extends JpaRepository<UserModel, Long> {
	
	public Optional<UserModel> findByEmailid(String emailid);
	
	public Optional<UserModel> findByEmailidAndPassword(String emailid,String password);
	
	public Optional<UserModel> findByPassword(String password);
	
	public List<UserModel> findAll(); 
}