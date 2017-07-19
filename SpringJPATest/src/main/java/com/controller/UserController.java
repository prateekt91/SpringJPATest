package com.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.UserRecord;
import com.service.UserService;

@RestController
public class UserController {

	private UserService userService;

	@RequestMapping("/")
	public List<UserRecord> getallUser() {

		return userService.getAllUser();
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addUser(@RequestBody UserRecord userRecord) {
		userService.addUser(userRecord);
	}
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public UserRecord getUser(@PathVariable String id){
		return userService.getUser(id);
	}
}
