package org.jsp.userbootapi.controller;

import java.util.List;

import org.jsp.userbootapi.dto.ResponseStructure;
import org.jsp.userbootapi.dto.User;
import org.jsp.userbootapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping(value = "/users")
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@PutMapping(value = "/users")
	public ResponseEntity<ResponseStructure<User>> updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<ResponseStructure<User>> findUserById(@PathVariable int id) {
		return service.findUserById(id);
	}

	@GetMapping("/users")
	public ResponseEntity<ResponseStructure<List<User>>> findAllUsers() {
		return service.findAllUsers();
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<ResponseStructure<String>> deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
}
