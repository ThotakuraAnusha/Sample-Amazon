package io.javabrains.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Retry.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
//	@RequestMapping("/topics")
//	public List<Topic>getAllTopics()
//	{
//		return Arrays.asList(
//				new Topic ("Spring" ,"Spring FrameWork", "Spring Framework Description"),
//				new Topic ("java" ,"core java","corejava Description"),	
//				new Topic ("Java Script " ,"Java Script", "java Script Description")
//				);
//	}  
//	
//
}
