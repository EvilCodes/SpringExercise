package com.black.beaninherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Child child=(Child) context.getBean("child");
		System.out.println(child.getHobbys());
		
	}
	

}
