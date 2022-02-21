package com.springstarter.topic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	@Autowired
	private topicRepository topicRepository;
	

	public List<Topic> getAllTopic() {
		// TODO Auto-generated method stub
		//return topics;
		 List<Topic> topics= new ArrayList<>();
		
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id){
		
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
		return topicRepository.findOne(id);
		
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		
	//	topics.add(topic);
		
		topicRepository.save(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		
	/*	for(int i = 0 ; i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		*/
		
		
		topicRepository.save(topic);
	}
	
	

	public void deletetopic(String id) {
	
		
		topicRepository.delete(id);
	}
	

}
