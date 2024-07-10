package com.course.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.Model.User;

public interface UserRepository extends JpaRepository<User,Long> {

	public User findByUsername(String username);

	
	
	
	
	
	
}
