package com.black.thingslistenter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ConfigurableApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		context.start();
		HelloWorld hello=(HelloWorld) context.getBean("hello");
		hello.sayHello();
		context.stop();
	}
	

}
