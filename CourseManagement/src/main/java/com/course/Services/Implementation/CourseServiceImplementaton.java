package com.course.Services.Implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.course.Model.Course;
import com.course.Repository.CourseRepository;
import com.course.Services.CourseService;

@Service
public class CourseServiceImplementaton implements CourseService{
	
	@Autowired
	private CourseRepository courseRepository;
	
	

	@Override
	public Course createCourse(Course course) {
		// TODO Auto-generated method stub
		return this.courseRepository.save(course);
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return this.courseRepository.findAll((Sort.by("id")));
	}


	@Override
	public Optional<Course> getCourseById(Long courseId) {
		// TODO Auto-generated method stub
		return this.courseRepository.findById(courseId);
	}

	@Override
	public void deleteCourse(Long courseId) {
		
		this.courseRepository.deleteById(courseId);
		
	}

	@Override
	public Course updateCourse(Course course) {
		
		return this.courseRepository.save(course);
	}

}
