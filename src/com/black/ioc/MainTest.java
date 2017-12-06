package com.black.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor editor=(TextEditor) context.getBean("textEditor");
		editor.spellCheck();
	}
	

}
