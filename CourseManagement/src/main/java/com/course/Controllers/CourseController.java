package com.course.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.Model.Course;
import com.course.Services.CourseService;



@RestController
@RequestMapping("/courses")
@CrossOrigin("*")
public class CourseController {

	@Autowired
	private CourseService courseService;
	

@PostMapping("/create")	
public Course createCourse(@RequestBody Course course) 
{
	return this.courseService.createCourse(course);
	
}

@GetMapping("/")
public List<Course> getAllCourses() {
	return this.courseService.getAllCourses();
}

@GetMapping("/{courseId}")
	public Optional<Course> getCourseById(@PathVariable("courseId") Long courseId ) {
		return this.courseService.getCourseById(courseId);
}

@DeleteMapping("/{courseId}")
public void deleteCourse(@PathVariable("courseId") Long courseId ) {
	 this.courseService.deleteCourse(courseId);
}

@PutMapping("/update")
public Course updateCourse(@RequestBody Course course) {
	return this.courseService.updateCourse(course);
}

}
