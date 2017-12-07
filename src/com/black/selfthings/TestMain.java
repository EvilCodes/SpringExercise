package com.black.selfthings;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		MySelfPublisher publisher=(MySelfPublisher) context.getBean("myselfPublisher");
		publisher.publish();
		publisher.publish();
		
	}

}
