package com.fiserv.ffx.springmongodbtemplate.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fiserv.ffx.springmongodbtemplate.model.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	List<User> findAllByOrderByRegistryNoDesc();

	User findByRegistryNo(Long regisrtyNo);

	User findByEmail(String email);

	User save(User user);
	
	void deleteById(String id);
}
