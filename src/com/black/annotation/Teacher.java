package com.black.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Teacher {
	
	private int age;
	private String name;
	private String course;
	private String hobbys;
	
//	@Autowired
	private TeacherMsg teacherMsg;
	
	@Autowired
	public Teacher(TeacherMsg teacherMsg){
//		this.age=age;
		this.teacherMsg=teacherMsg;
		
	}
	
	public TeacherMsg getTeacherMsg(){
		
		return teacherMsg;
	}
	public int getAge() {
		return age;
	}
	@Autowired(required=false)
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getHobbys() {
		return hobbys;
	}
	public void setHobbys(String hobbys) {
		this.hobbys = hobbys;
	}
	
	

}
