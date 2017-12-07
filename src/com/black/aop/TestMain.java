package com.black.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		Game myGame=(Game) context.getBean("game1");
		System.out.println(myGame.toString());
//		System.out.println(myGame.getName());
	}

}
