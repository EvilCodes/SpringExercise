package com.black.autowired;

public class Student {
	private StuMsg stuMsg;
	private String name;
	private String gendar;
	private int age;
	
	public Student(String name,StuMsg stuMsg){
		this.name=name;
		this.stuMsg=stuMsg;
		
	}
	public StuMsg getStuMsg() {
		return stuMsg;
	}
	public void setStuMsg(StuMsg stuMsg) {
		this.stuMsg = stuMsg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Student [stuMsg=" + stuMsg + ", name=" + name + ", gendar=" + gendar + ", age=" + age + "]";
	}
	
	
	public void getInSys(){
		stuMsg.showMsg();
	}
	
	
	

}
