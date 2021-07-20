package com.javatpoint.apachederbyexample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.apachederbyexample.model.UserRecord;
import com.javatpoint.apachederbyexample.repository.UserRepository;

@Service    
public class UserService   
	{    
	@Autowired    
	private UserRepository userRepository;    
	
	public List<UserRecord> getAllUsers()  
	{    
		List<UserRecord>userRecords = new ArrayList<>();    
		userRepository.findAll().forEach(userRecords::add);    
		return userRecords;    
	}    
	
	public void addUser(UserRecord userRecord)  
	{    
		userRepository.save(userRecord);    
	}    
}    
