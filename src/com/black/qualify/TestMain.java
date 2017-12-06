package com.black.qualify;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		PhoneCollect phoneCollect=(PhoneCollect) context.getBean("phoneCollect");
		phoneCollect.showDesc();
		
	}
}
