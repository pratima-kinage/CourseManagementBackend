package com.course.Services;

import java.util.List;
import java.util.Set;

import com.course.Model.User;
import com.course.Model.UserRole;


public interface UserService {
	
//creating user
	
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	public List<User> getAllUser();
	
	public User getByUsername( String username);

	public void deleteUser(Long userId);

	public User updateUser(User updatesUser);
	
}
