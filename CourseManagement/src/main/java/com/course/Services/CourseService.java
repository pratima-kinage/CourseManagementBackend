package com.course.Services;


import java.util.List;
import java.util.Optional;

import com.course.Model.Course;

public interface CourseService {

	public Course createCourse(Course course);

	public List<Course> getAllCourses();

	public Optional<Course> getCourseById(Long courseId);

	public void deleteCourse(Long courseId);

	public Course updateCourse(Course course);

}
