package com.example.HelloWorldAppBoot.topics;

import org.springframework.data.repository.CrudRepository;

public interface  TopicRepository extends CrudRepository<Topics,String> {
	
	//getAllTopics()
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
	

}
