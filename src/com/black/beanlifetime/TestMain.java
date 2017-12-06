package com.black.beanlifetime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		LifeBean life=(LifeBean) context.getBean("lifetime");
		System.out.println(life.getName());
		
	}

}
