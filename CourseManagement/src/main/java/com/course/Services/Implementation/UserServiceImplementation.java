package com.course.Services.Implementation;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.Model.User;
import com.course.Model.UserRole;
import com.course.Repository.RoleRepository;
import com.course.Repository.UserRepository;
import com.course.Services.UserService;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	
	
//this method for creating user
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception
	{
		// TODO Auto-generated method stub
		//check here user already present in Db or not
		
		User local = this.userRepository.findByUsername(user.getUsername());
		if(local != null)
		{
			System.out.println("User is already present");
			throw new Exception("User already there");
		}
		else {
			//create user
			for(UserRole ur:userRoles) {
				roleRepository.save(ur.getRole());
			}
			
			user.getUserRoles().addAll(userRoles); 
			
			local=this.userRepository.save(user);
		}
		
		
		return local;
	}




	@Override
	public List<User> getAllUser() {
		
		return this.userRepository.findAll();
		
	}




	@Override
	public User getByUsername(String username) {
	
		return this.userRepository.findByUsername(username);
		
	}



	
	@Override
	public void deleteUser(Long userId) {
		
		 this.userRepository.deleteById(userId);;
	}




	@Override
	public User updateUser(User updatesUser) {
		
		return this.userRepository.save(updatesUser);
	}

}
