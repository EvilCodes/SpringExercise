package com.black.function;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		IGetStuImpl stuProduct=(IGetStuImpl) context.getBean("stuFunction");
		Student stu = stuProduct.getStu(1);
		System.out.println(stu.toString());
	}

}
