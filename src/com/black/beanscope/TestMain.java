package com.black.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Teacher tec1 = (Teacher) context.getBean("teacher");
		Teacher tec2=(Teacher) context.getBean("teacher");
		
		System.out.println(tec1+"====="+tec2);
	}
	
	
	

}
