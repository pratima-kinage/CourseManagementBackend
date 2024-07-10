package com.course.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.Model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	
//	public List<Course> findAllOrderById(Long id);

}
