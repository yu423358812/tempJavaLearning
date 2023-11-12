package com.fiserv.ffx.springmongodbtemplate.controller.v1;

import java.util.List;

import com.fiserv.ffx.springmongodbtemplate.service.UserService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiserv.ffx.springmongodbtemplate.model.entity.User;

@RestController
@RequestMapping("/v1/user")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(value = "")
	public List<User> getAllUsers() {
		return userService.findAllByOrderByRegistryNoDesc();
	}

	@PostMapping(value = "")
	public User saveUser(@RequestBody User user) {
		return userService.save(user);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteForm(@PathVariable("id") String id) {
		userService.deleteById(id);
	}
}
