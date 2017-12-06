package com.black.innerproperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		MsgEntity msgEntity=(MsgEntity) context.getBean("entityMsg");
		MsgShow showEntity = msgEntity.getShowEntity();
		showEntity.showMsg();
	}

}
