package com.springstarter.course;


import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course ,String >{

	Course findOne(String id);

	void delete(String id);
	
}
