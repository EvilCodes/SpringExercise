package com.black.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld helloWorld=(HelloWorld) context.getBean("processor");
		System.out.println(helloWorld.getMsg());
//		context.registerShutdownHook();
		
		
	}

}
