package com.black.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import org.springframework.context.ApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		StuHandleImpl stuHandler=(StuHandleImpl) context.getBean("studentTemplate");
//		Student student = stuHandler.getStudent(1);
//		stuHandler.deleteData(2);
//		List<Student> students = stuHandler.getStudents();
//		for (Student student : students) {
//			System.out.println(student.getName());
//			
//		}
//		stuHandler.updateData(3, "刘翰林");
		Student stu=new Student();
		stu.setAge(22);
		stu.setId(5);
		stu.setGendar("男");
		stu.setHobbys("王者荣耀");
		stu.setName("刘贵志");
		stuHandler.insertData(stu);
//		System.out.println(student.getName());
	}

}
