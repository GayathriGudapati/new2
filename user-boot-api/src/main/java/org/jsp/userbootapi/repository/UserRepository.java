package org.jsp.userbootapi.repository;

import org.jsp.userbootapi.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
}
