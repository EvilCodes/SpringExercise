package com.black.jsr;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		Car car=(Car) context.getBean("car");
		car.getCarDesc().getIn();
		car.getCarDesc().getName();
		System.out.println(car.toString());
		context.registerShutdownHook();
		
	}

}
