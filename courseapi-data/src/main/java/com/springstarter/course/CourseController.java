package com.springstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	
	
	
	
	@Autowired
	private CourseService topicService;
	
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllTpoic(@PathVariable String id ){
		return topicService.getAllCourses(id);
	}

		@RequestMapping("/topics/{id}/courses/{courseId}")
		public Course getTopic(@PathVariable String id ) {
			return topicService.getCourse(id);
		}
		
		@RequestMapping(method=RequestMethod.POST , value="/topics")
		public void addTopic(@RequestBody Course  course) {
			topicService.addCourse(course);
			
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
		public void updateTopic(@RequestBody Course topic , @PathVariable String id) {
			topicService.updateCourse(id ,topic);
			
		}
		@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
		public void updateopic( @PathVariable String id) {
			topicService.deleteCourse(id);
			
		}
}
