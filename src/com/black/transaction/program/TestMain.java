package com.black.transaction.program;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		StudentJDBCTemplate template=(StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
		template.create("王刚", 33, 99, 2012);
		
		List<StudentMarks> studengMarks = template.listStudents();
		for (StudentMarks studentMark : studengMarks) {
			System.out.print(studentMark.getAge());
			System.out.print(studentMark.getName());
			System.out.print(studentMark.getHobbys());
			
		}
				
	}

}
