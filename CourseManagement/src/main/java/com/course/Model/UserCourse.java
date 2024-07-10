package com.course.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserCourse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userCourseId;
	
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Course course;

}

