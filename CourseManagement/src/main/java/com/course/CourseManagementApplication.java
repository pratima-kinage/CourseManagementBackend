package com.course;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.course.Model.Role;
import com.course.Model.User;
import com.course.Model.UserRole;
import com.course.Services.UserService;

@SpringBootApplication
public class CourseManagementApplication implements CommandLineRunner{
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(CourseManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code");
		
//		User user=new User();
//		user.setFirstName("Pratima");
//		user.setLastName("Kinage");
//		user.setUsername("pratima02");
//		user.setEmail("pratima@gmail.com");
//		user.setPassword("abc");
//		user.setProfileImage("defaultprofile.png");
//		user.setPhoneNumber("7583023093");
//		
//		Role role1=new Role();
//		role1.setId(44L);
//		role1.setRoleName("ADMIN");
//		
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		
//		userRoleSet.add(userRole);
//		
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
//		
		
		
		
		
	}

}
