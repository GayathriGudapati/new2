package org.jsp.userbootapi.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.userbootapi.dto.User;
import org.jsp.userbootapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	private UserRepository repository;

	public User saveUser(User user) {
		return repository.save(user);
	}

	public User updateUser(User user) {
		return repository.save(user);
	}

	public Optional<User> findById(int id) {
		return repository.findById(id);
	}

	public boolean delete(int id) {
		Optional<User> dBUser = findById(id);
		if (dBUser.isPresent()) {
			repository.delete(dBUser.get());
			return true;
		}
		return false;
	}

	public List<User> findAll() {
		return repository.findAll();
	}
}
