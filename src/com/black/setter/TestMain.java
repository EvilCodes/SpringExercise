package com.black.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		ShowEntity showEntity=(ShowEntity) context.getBean("msgEntity");
		ShowMsg showMsg = showEntity.getShowMsg();
		showMsg.showMsg();
	}

}
