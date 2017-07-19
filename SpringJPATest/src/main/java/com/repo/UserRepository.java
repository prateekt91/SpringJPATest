package com.repo;

import org.springframework.data.repository.CrudRepository;

import com.pojo.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord, String>{

	
}
