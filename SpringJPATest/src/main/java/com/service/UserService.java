package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pojo.UserRecord;
import com.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<UserRecord> getAllUser(){
		
		List<UserRecord> userRecords = new ArrayList<>();
		userRepository.findAll().forEach(userRecords::add);
		return userRecords;
	}
	
	public UserRecord getUser(String id){
		
		return userRepository.findOne(id);
		
	}
	
	public void addUser(UserRecord userRecord) {
		userRepository.save(userRecord);
	}
	
	public void deleteUser(String id) {
		userRepository.delete(id);
	}
}
