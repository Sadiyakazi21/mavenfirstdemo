package com.springstarter.topic;


import org.springframework.data.repository.CrudRepository;


public interface topicRepository extends CrudRepository<Topic ,String >{

	Topic findOne(String id);

	void delete(String id);
	
}
