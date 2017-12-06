package com.black.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		Teacher tea=(Teacher) context.getBean("tea");
		tea.getTeacherMsg().showMsg();
		
	}

}
