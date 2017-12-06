package com.black.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain{
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		Student stu=(Student) context.getBean("stu");
		System.out.println(stu.getName());
		stu.getInSys();
		
	}
	
	
}
