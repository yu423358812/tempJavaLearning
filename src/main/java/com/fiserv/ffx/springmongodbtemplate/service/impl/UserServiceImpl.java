package com.fiserv.ffx.springmongodbtemplate.service.impl;

import java.util.List;

import com.fiserv.ffx.springmongodbtemplate.service.UserService;
import org.springframework.stereotype.Service;

import com.fiserv.ffx.springmongodbtemplate.model.entity.User;
import com.fiserv.ffx.springmongodbtemplate.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> findAllByOrderByRegistryNoDesc() {
		return userRepository.findAllByOrderByRegistryNoDesc();
	}

	@Override
	public User findByRegistryNo(Long regisrtyNo) {
		return userRepository.findByRegistryNo(regisrtyNo);
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public User save(User User) {
		return userRepository.save(User);
	}

	@Override
	public void deleteById(String id) {
		userRepository.deleteById(id);
	}
}
