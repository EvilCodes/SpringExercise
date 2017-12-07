package com.black.beanscope;

public class Teacher {
	private String name;
	private String course;
	private String gendar;
	private int age;
	
	public void Teacher(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGendar() {
		return gendar;
	}
	public void setGendar(String gendar) {
		this.gendar = gendar;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", course=" + course + ", gendar=" + gendar + ", age=" + age + "]";
	}
	
	
	

}
