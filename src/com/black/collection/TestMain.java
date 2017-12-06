package com.black.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		CollectionEntity colEntity = (CollectionEntity) context.getBean("injectColl");
		System.out.println(colEntity.toString());
		
	}

}
