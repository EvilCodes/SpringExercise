package com.black.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		StuMsg stuMsg=(StuMsg) context.getBean("stuMsg1");
		System.out.println(stuMsg.getHobbys());
//		System.out.println(stuMsg.getAge());
//		System.out.println(stuMsg.getGendar());
		
		
	}

}
