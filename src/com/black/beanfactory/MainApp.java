package com.black.beanfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
//		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		
		ApplicationContext context=new FileSystemXmlApplicationContext("G:/MyWorld/WorkSpace/EclipseWorkSpace/SpringDemo/src/Beans.xml");
		HelloWorld msg=(HelloWorld) context.getBean("helloworld");
		msg.getMessage();
	}
	
	

}
