package com.example.HelloWorldAppBoot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepo;

	List<Topics> topics = new ArrayList(Arrays.asList(new Topics("Spring", "Springboot", "framowork"),
			new Topics("Java", "1.8", "Core Java"), new Topics("Hibernate", "4", "ORM Framework")));

	public List<Topics> getAllTopics() {
		List<Topics> topics=new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}

	public Topics getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topics topic) {
		
		topicRepo.save(topic);
	}

	public void updateTopic(String id, Topics topic) {
		System.out.println("Update method");
		for(int i=0;i<topics.size();i++)
		{
			Topics t=topics.get(i);
			if(t.getId().equals(id))
			{
					topics.set(i,topic);
			}
		}
		
	}

	public void deleteTopic(String id, Topics topic) {
		
		/*for(int i=0;i<topics.size();i++)
		{
			Topics t=topics.get(i);
			if(t.getId().equals(id))
			{
				topics.remove(id);
			}
		}
		
*/
		topics.removeIf(t->t.getId().equals(id));
		
	}
}
